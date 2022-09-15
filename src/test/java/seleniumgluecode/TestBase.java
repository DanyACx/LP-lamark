package seleniumgluecode;

import org.openqa.selenium.WebDriver;
import pom.MsisdnPage;
import pom.PinCodePage;

public class TestBase {

    protected WebDriver driver = Hooks.getDriver();

    protected MsisdnPage msisdnPage = new MsisdnPage(driver);

    protected PinCodePage pincodePage = new PinCodePage(driver);
}
