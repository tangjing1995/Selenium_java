package po.page;

import common.adapter.WebPageEelement;
import po.LE;


public class LoginPage {

    public WebPageEelement driver = null;


    public LoginPage(WebPageEelement driver) {
        this.driver = driver ;

    }


    /**
     *  点击首页登录文本
     */
    public void clickLoginText(){
        driver.click(LE.HOME_PAGE_LOGIN_TEXT);
    }


    /**
     *  账户框输入文本
     */
    public void sendUser(String value){
        driver.send(LE.LOGIN_USERNAME_EDIT,value);
    }


    /**
     *  密码框输入文本
     */
    public void sendPassowrd(String value){
        driver.send(LE.LOGIN_PASSWORD_EDIT,value);
    }

    /**
     *  点击登录按钮
     */
    public void clickLoginBtn(){
        driver.click(LE.LOGIN_BTN);
    }



    public String getResults(){
        driver.sleep(1);
        return  driver.getText(LE.LOGIN_RESULT_POP);
    }

}
