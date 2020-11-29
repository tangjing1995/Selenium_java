package TestCase;
import com.report.html.HtmlFile;
import org.testng.TestNG;

public class AllTests {
    public static void main(String[] args) {
        HtmlFile hf = new HtmlFile();
        hf.createLog("d:\\test66.html");
        TestNG testNG = new TestNG();
        Class[] classes = {TestLogin.class};
        testNG.setTestClasses(classes);
        testNG.run();
        hf.closeLog();
    }
}
