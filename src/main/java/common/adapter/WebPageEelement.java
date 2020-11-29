package common.adapter;
import common.Log;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import po.LE;
import java.util.concurrent.TimeUnit;
import config.LocalConfig;

public class WebPageEelement {



	private  WebDriver driver = null;
	public static WebPageEelement webPageEelement = null ;
    public WebElement element =null;



    /**
     *
     * @param browser 需要操作的浏览器名称
     * @param array   第一位数 设置浏览器下载路径
     */

    public WebPageEelement(String browser ) {
        if (browser == null || browser.equals("")){
            return;
        }

        if (browser == "Chrome"){
            driver=new ChromeDriverConfig(LocalConfig.DOWN_LOADS_PATH);
        }else if (browser == "Firefox"){
            driver=new FirefoxDriver();
        }else if (browser == "Ie"){
            driver=new InternetExplorerDriver();
        }else {
            System.out.println("你输入的浏览器不存在或未适配！");
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(LocalConfig.ELE_TIME_OUT, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(LocalConfig.PAGE_TIME_OUT, TimeUnit.SECONDS);
    }



    /**
     * 单例模式保证 driver 唯一性
     * @param  browser 需要操作的浏览器名称
     * @return  本类实例
     */

    public static WebPageEelement getInstance(String browser) {
        if (webPageEelement == null) {
            synchronized(WebPageEelement.class){
                if (webPageEelement == null){
                    webPageEelement = new WebPageEelement(browser);
                }
            }
        }
        return webPageEelement;
    }




    /**
     *
     * @param url 网址地址
     */
    public void openUrl(String url) {
        driver.get(url);
        sleep(1);
        Log.info("测试网页:"+url);
    }


    /**
     *
     * @param args 传2个参数 是设置大小    一个参数是执行页面动作
     */
    public void HandleWindows(String ...args){
        if (args.length==1){
            if (args[0].equals("max")){
                driver.manage().window().maximize();
                Log.info("页面全屏");
            }else if (args[0].equals("back")){
                driver.navigate().back();
                Log.info("后退页面");
            }else if (args[0].equals("forward")){
                driver.navigate().forward();
                Log.info("前进页面");
            }else if (args[0].equals("refresh")){
                driver.navigate().refresh();
                Log.info("刷新页面");

            }
        }else if (args.length==2){
            Dimension dimension = new Dimension(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
            driver.manage().window().setSize(dimension);
            Log.info("设置浏览器大小:"+args[0]+","+args[1]);
        }

    }


    /**
     *  点击元素
     * @param info LE类  中元素信息
     */
    public void click(String info){
        WebElement webElement = null;
        try {
             webElement = find(info);
        }catch (Exception e){
            e.printStackTrace();
        }
        webElement.click();
    }


    /**
     *
     * @param info LE类  中元素信息
     * @param value 输入的值 或者文件路径
     */
    public void send(String info,String value){
        WebElement webElement = find(info);
        if (!value.contains("//")){
            webElement.clear();
        }
        sleep(2);
        webElement.sendKeys(value);
        Log.info("输入:"+value);
    }


    /**
     *
     * @param info LE类  中元素信息
     * @return 元素的 text文本
     */
    public String getText(String info){
        WebElement webElement = find(info);
        String content = webElement.getText();
        Log.info("获取文本内容："+content);
        return  content;
    }

    /**
     *
     * @param info LE类  中元素信息
     * @return fasle 不存咋  true 存在
     */
    public Boolean elementExist(String info){
        try {
            this.find(info);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    /**
     *
     * @param time 秒
     */
    public void sleep(int time){
        try {
            Thread.sleep(time*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }






    /**
     *
     * @param info LE类  中元素信息
     * @return 元素对象
     */
    public WebElement find(String info){
        String[] valus =  getLocalElement(info);
        if (valus[0].equals("id")){
            element = driver.findElement(By.id(valus[1]));
        }else if (valus[0].equals("name")){
            element = driver.findElement(By.name(valus[1]));
        }else if (valus[0].equals( "linkText")){
            element = driver.findElement(By.linkText(valus[1]));
        }else if (valus[0].equals("class")){
            element = driver.findElement(By.className(valus[1]));
        }else if (valus[0].equals("xpath")){
            element = driver.findElement(By.xpath(valus[1].toString()));
        }else if (valus[0].equals("css")){
            element = driver.findElement(By.cssSelector(valus[1]));
        }else {
            System.out.println("你输入的定位方式不存在或不支持");
        }

        return element;
    }



    /**
     *  退出浏览器
     */

    public void exit(){
        driver.quit();
        Log.info("退出登录");
    }


    public WebDriver getWebDriver(){
        return driver;
    }

    public String [] getLocalElement(String info){
        if (info.contains("{}")){
            info = info.replace("{}", LE.variable);
        }
        return parsingEelmentInfo(info);
    }

    public String []  parsingEelmentInfo(String info){
        if("<".contains(info)){
            return null;
        }
        return info.split("<");
    }



}
