package po;

/**
 *
 *
 *  这是一个Selenium 元素定位信息  与测试网站 url 共用的文件
 *
 *  {} 代表元素信息动态值
 *  < 前 是定位方式   <后是定位信息
 *
 *  例子：(//*[@type='image/svg+xml'])[4] 如果你想在外面传参改变定位信息   可以使用 (//*[@type='image/svg+xml'])[{}]
 *
 *
 */


public class LE {




public static String variable = null;  //用来代替使用{}

//***************************网页首页*********************************

public static String  HOME_PAGE_LOGIN_TEXT = "xpath<//*[text()='登录']";




//***************************登录页面*********************************
//动作

public static String LOGIN_USERNAME_EDIT = "xpath<//*[@for='username']/../descendant-or-self::input";       //用户名输入框
public static String LOGIN_PASSWORD_EDIT = "xpath<//*[@for='password']/../descendant-or-self::input";       //密码输入框
public static String LOGIN_BTN = "xpath<//*[@id='login']";                                                  //登录按钮



//文本类型获取
public static String LOGIN_RESULT_POP ="xpath<//*[@class='el-notification__title']|//*[@class='el-message__content']";






//***************************登录首页*********************************
public static String LOGIN_HOME_PAGE_MODE_SETTINGS = "xpath<(//*[@type='image/svg+xml'])[3]";

//***************************设置模块*********************************
//个人资料
public static String SETTINGS_PERSONAL_ICON = "xpath<//*[@id='file']";                                  //个人头像
public static String SETTINGS_AGE_EDIT = "xpath<//*[@name='age']";                                         //年龄
public static String SETTINGS_SEX_SELECT = "xpath<//*[@name='sex']";                                         //性别
public static String SETTINGS_SEX_ITME = "xpath<//*[text()='{}']";
public static String SETTINGS_COMPANY_EDIT = "xpath<//*[@name='company']";                                  //公司
public static String SETTINGS_QQ_EDIT = "xpath<//*[@name='qq']";                                            //qq
public static String SETTINGS_EMAIL_EDIT = "xpath<//*[@name='email']";                                      //邮箱
public static String SETTINGS_PHONE_EDIT = "xpath<//*[@name='phone']";                                      //邮箱
public static String PERSONAL_DATA_SAVE_BTN = "xpath<//*[@name='phone']/ancestor-or-self::form/" +
        "descendant-or-self::*[contains(text(),'保存')]/..";                                         //个人资料 & 保存按钮


//修改密码
public static String SETTINGS_ORIGINAL_PASSWORD_EDIT = "xpath<//*[contains(text(),'原密码')]" +
        "/../descendant-or-self::input";                                                        //原密码
public static String SETTINGS_NEW_PASSWORD_EDIT = "xpath<//*[contains(text(),'新密码')]" +
        "/../descendant-or-self::input";                                                        //新密码
public static String SETTINGS_CONFIRM_PASSWORD_EDIT = "xpath<//*[contains(text(),'确认密码')]" +
        "/../descendant-or-self::input";                                                         //确认密码
public static String UPDATA_PASSWORD_SAVE_BTN = "xpath<//*[text()='原密码']/ancestor-or-self::form/" +
        "descendant-or-self::*[contains(text(),'保存')]/..";                                      //修改密码 & 保存按钮


//发件设置
public static String SETTINGS_EMAIL_ACCOUNT_EDIT = "xpath<//*[contains(text(),'发件人邮箱账户')]/../descendant-or-self::input";           //发件人邮箱账户
public static String SETTINGS_EMAIL_PASSWORD_EDIT = "xpath<//*[contains(text(),'发件人邮箱密码')]/../descendant-or-self::input";           //发件人邮箱密码
public static String SETTINGS_EMAIL_SMTP_ADDRESS_EDIT = "xpath<//*[contains(text(),'发件人smtp地址')]/../descendant-or-self::input";           //发件人smtp地址
public static String SETTINGS_EMAIL_SMTP_PORT_EDIT = "xpath<//*[contains(text(),'发件人smtp端口')]/../descendant-or-self::input";           //发件人smtp端口
public static String SENDER_SETTINGS_SAVE_BTN = "xpath<//*[text()='发件人smtp地址']/ancestor-or-self::form/" +
        "descendant-or-self::*[contains(text(),'保存')]/..";                                      //发件设置 & 保存按钮
public static String SETTINGS_RESULTS_POP_TEXT = "xpath<//*[text()='保存成功']";


}
