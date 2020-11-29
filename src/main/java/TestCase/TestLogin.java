package TestCase;

import com.report.html.HtmlFile;
import common.adapter.WebPageEelement;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import po.busines.LoginBis;

public class TestLogin {
    static HtmlFile hf;
    static WebPageEelement driver = null;




    @BeforeSuite
    public  static  void beforeTest(){
        driver = WebPageEelement.getInstance("Chrome");
        driver.openUrl("http://www.doclever.cn/controller/index/index.html");
        driver.HandleWindows("max");
        hf = new HtmlFile();

   }

    @Test
    public void loginTest(){
        hf.write("用例1","a","a");
        String  username="" ;
        String  password="";
        LoginBis loginBis = new LoginBis(driver);
        loginBis.login(username,password);
        Assert.assertTrue(loginBis.loginResults());
    }



}
