package po.busines;

import common.adapter.WebPageEelement;
import po.page.LoginPage;

/**
 *  登录 业务逻辑操作类
 */


public class LoginBis extends LoginPage {




    public LoginBis(WebPageEelement driver) {
        super(driver);
    }


    public void login(String user ,String password){
        clickLoginText();
        sendUser(user);
        sendPassowrd(password);
        clickLoginBtn();
    }

    public Boolean loginResults(){
        if (getResults().equals("登录成功")){
            return true;
        }else {
            return false;
        }

    }

}
