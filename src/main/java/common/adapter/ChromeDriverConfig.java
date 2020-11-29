package common.adapter;
import common.Log;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class ChromeDriverConfig extends ChromeDriver {





    public ChromeDriverConfig(String path) {
        File file =new File(path);
       if (path.equals("") || path == null||!file.exists()){
           Log.info("默认下载路径不存在！");
            return;
        }
        setDownloadsPath(path);
        Log.info("设置下载路径为:"+path);
    }




    /**
     *
     * @param path 设置默认下载路径
     * @return DesiredCapabilities 浏览器配置实例
     */
    public DesiredCapabilities setDownloadsPath(String path){
        Map<String, Object> chromePrefs = new HashMap<String, Object>();
        chromePrefs.put("download.default_directory", path);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--user-data-dir="+System.getenv("USERPROFILE")
                +"/AppData/Local/Google/Chrome/User Data/Default");
        options.setExperimentalOption("prefs", chromePrefs);
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(ChromeOptions.CAPABILITY, options);
        return caps;
    }




}
