package po.page;
import common.adapter.WebPageEelement;
import po.LE;


public class SettingsPage {

    public WebPageEelement driver = null;


    public SettingsPage(WebPageEelement driver) {
        this.driver = driver;
    }


    /**
     *  点击设置模块按钮
     */
    public void clickSettingsIcon(){
        driver.click(LE.LOGIN_HOME_PAGE_MODE_SETTINGS);
    }


    /**
     *  设置头像
     * @param value 图片路径
     */
    public void setIcon(String value){
        driver.send(LE.SETTINGS_PERSONAL_ICON,value);
    }

    /**
     *  设置年龄
     * @param value 年龄
     */
    public void setAge(String value){
        driver.send(LE.SETTINGS_AGE_EDIT,value);
    }


    /**
     *  设置性别
     * @param value 性别
     */
    public void setSex(String value){

        driver.click(LE.SETTINGS_SEX_SELECT);
        LE.variable = value;
        driver.click(LE.SETTINGS_SEX_ITME);
    }

    /**
     *  设置公司
     * @param value 公司
     */
    public void setComPany(String value){
        driver.send(LE.SETTINGS_COMPANY_EDIT,value);
    }

    /**
     *  设置qq
     * @param value qq
     */
    public void setQQ(String value){
        driver.send(LE.SETTINGS_QQ_EDIT,value);
    }


    /**
     *  设置邮箱
     * @param value 邮箱
     */
    public void setEmail(String value){
        driver.send(LE.SETTINGS_EMAIL_EDIT,value);
    }

    /**
     *  设置公司
     * @param value 手机
     */
    public void setPhone(String value){
        driver.send(LE.SETTINGS_PHONE_EDIT,value);

    }

    /**
     *  点击保存
     */
    public void clickSave(){
        driver.click(LE.SENDER_SETTINGS_SAVE_BTN);

    }


    /**
     *  获取保存成功弹框文本
     */
    public Boolean getResultsPopText(){
       return driver.elementExist(LE.SETTINGS_RESULTS_POP_TEXT);
    }



}
