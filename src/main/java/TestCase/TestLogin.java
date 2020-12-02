package TestCase;

import com.report.html.HtmlFile;
import common.adapter.WebPageEelement;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
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
    @Parameters({"username","password"})
    @Test
    public void loginTest(String username,String password){
        hf.write("用例1","a","a");
        LoginBis loginBis = new LoginBis(driver);
        loginBis.login(username,password);
        Assert.assertTrue(loginBis.loginResults());
    }



}
