package po.busines;

import common.Log;
import common.adapter.WebPageEelement;
import po.page.SettingsPage;

public class SettingsBis extends SettingsPage {

    public SettingsBis(WebPageEelement driver) {
        super(driver);
    }


    public void  settingsPersonalData(String iconPath,String age,String comPany,
                                      String qq,String email,String phone){
        clickSettingsIcon();
        setIcon(iconPath);
        setAge(age);
        setComPany(comPany);
        setQQ(qq);
        setEmail(email);
        setPhone(phone);
        clickSave();
        Log.info(getResultsPopText());
    }


    public Boolean settingsResults(){
       return getResultsPopText();
    }

}
