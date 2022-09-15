package seleniumgluecode;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;

import java.util.HashMap;
import java.util.Map;


public class Hooks {

    private static ChromeDriver driver;
    private static int i = 0;
    private static  int j = 0;

    @Before
    public void setUp(){

        int ancho[] = {360, 360, 360, 411, 412, 414, 276, 375, 414, 390, 360, 390, 428, 375, 375, 276, 375, 414, 360, 360, 534, 360, 360, 393, 360, 411, 432, 375, 390, 384, 360, 400, 360, 480, 360, 480};
        int alto[] = {740, 640, 800, 731, 690, 736, 598, 812, 896, 844, 780, 844, 926, 667, 812, 598, 812, 896, 640, 598, 854, 800, 640, 786, 780, 731, 768, 667, 695, 640, 600, 640, 640, 800, 640, 1067};
        System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        DevTools devTools = driver.getDevTools();
        devTools.createSession();

        Map<String, Object> dm = new HashMap<String, Object>();

        dm.put("width", ancho[i]);
        dm.put("height", alto[j]);
        dm.put("deviceScaleFactor", 50);
        dm.put("mobile", true);

        driver.executeCdpCommand("Emulation.setDeviceMetricsOverride", dm);

        driver.get("https://certi.lp.lamark-it.com/main/#/subs/mlm/bh/batelco");
    }

    @After
    public void tearDown(){
        i = i+1;
        j = j+1;
        driver.quit();
    }

    public static ChromeDriver getDriver(){
        return driver;
    }
}
