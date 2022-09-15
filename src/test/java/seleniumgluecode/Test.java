package seleniumgluecode;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test extends TestBase{

    private WebDriver driver = Hooks.getDriver();

    @Given("^Ingreso con mi SG-Note-(\\d+) de dimensiones (\\d+) y (\\d+)$")
    public void ingresoConMiSGNoteDeDimensionesY(int arg1, int arg2, int arg3) throws Throwable {
        Assert.assertTrue(msisdnPage.msisdnPageVisualizada());
    }

    @When("^Ingreso mi (\\d+)$")
    public void ingresoMi(int arg1) throws Throwable {
        msisdnPage.ingresarNumero(String.valueOf(arg1));
    }

    @When("^hago click en el botón 'Suscribir'$")
    public void hagoClickEnElBotónSuscribir() throws Throwable {
        msisdnPage.hacerClick();
    }

    @When("^Ingreso el (\\d+)$")
    public void ingresoEl(int arg1) throws Throwable {
        pincodePage.ingresarNumero(String.valueOf(arg1));
    }

    @When("^hago click en el botón 'Confirmar'$")
    public void hagoClickEnElBotónConfirmar() throws Throwable {
        pincodePage.hacerClick();
    }

    @Then("^debería figurar el page successfully$")
    public void deberíaFigurarElPageSuccessfully() throws Throwable {
        Assert.assertTrue(pincodePage.seVisualizaSuccessPage());
    }

    @Given("^Ingreso con mi SG-S(\\d+)-edge de dimensiones (\\d+) y (\\d+)$")
    public void ingresoConMiSGSEdgeDeDimensionesY(int arg1, int arg2, int arg3) throws Throwable {
        Assert.assertTrue(msisdnPage.msisdnPageVisualizada());
    }

    @Given("^Ingreso con mi SG-S(\\d+)-Lite de dimensiones (\\d+) y (\\d+)$")
    public void ingresoConMiSGSLiteDeDimensionesY(int arg1, int arg2, int arg3) throws Throwable {
        Assert.assertTrue(msisdnPage.msisdnPageVisualizada());
    }

    @Given("^Ingreso con mi Google-Pixel-XL de dimensiones (\\d+) y (\\d+)$")
    public void ingresoConMiGooglePixelXLDeDimensionesY(int arg1, int arg2) throws Throwable {
        Assert.assertTrue(msisdnPage.msisdnPageVisualizada());
    }

    @Given("^Ingreso con mi Motorola-Nexus-(\\d+) de dimensiones (\\d+) y (\\d+)$")
    public void ingresoConMiMotorolaNexusDeDimensionesY(int arg1, int arg2, int arg3) throws Throwable {
        Assert.assertTrue(msisdnPage.msisdnPageVisualizada());
    }

    @Given("^Ingreso con mi iPhone-(\\d+) de dimensiones (\\d+) y (\\d+)$")
    public void ingresoConMiIPhoneDeDimensionesY(int arg1, int arg2, int arg3) throws Throwable {
        Assert.assertTrue(msisdnPage.msisdnPageVisualizada());
    }

    @Given("^Ingreso con mi iPhone-(\\d+)-Pro de dimensiones (\\d+) y (\\d+)$")
    public void ingresoConMiIPhoneProDeDimensionesY(int arg1, int arg2, int arg3) throws Throwable {
        Assert.assertTrue(msisdnPage.msisdnPageVisualizada());
    }

    @Given("^Ingreso con mi iPhone-(\\d+)-Pro-Max de dimensiones (\\d+) y (\\d+)$")
    public void ingresoConMiIPhoneProMaxDeDimensionesY(int arg1, int arg2, int arg3) throws Throwable {
        Assert.assertTrue(msisdnPage.msisdnPageVisualizada());
    }

    @Given("^Ingreso con mi iPhone-(\\d+)-Mini de dimensiones (\\d+) y (\\d+)$")
    public void ingresoConMiIPhoneMiniDeDimensionesY(int arg1, int arg2, int arg3) throws Throwable {
        Assert.assertTrue(msisdnPage.msisdnPageVisualizada());
    }

    @Given("^Ingreso con mi iPhone-SE de dimensiones (\\d+) y (\\d+)$")
    public void ingresoConMiIPhoneSEDeDimensionesY(int arg1, int arg2) throws Throwable {
        Assert.assertTrue(msisdnPage.msisdnPageVisualizada());
    }

    @Given("^Ingreso con mi iPhone-X de dimensiones (\\d+) y (\\d+)$")
    public void ingresoConMiIPhoneXDeDimensionesY(int arg1, int arg2) throws Throwable {
        Assert.assertTrue(msisdnPage.msisdnPageVisualizada());
    }

    @Given("^Ingreso con mi iPhone-XR de dimensiones (\\d+) y (\\d+)$")
    public void ingresoConMiIPhoneXRDeDimensionesY(int arg1, int arg2) throws Throwable {
        Assert.assertTrue(msisdnPage.msisdnPageVisualizada());
    }

    @Given("^Ingreso con mi iPhone-XS de dimensiones (\\d+) y (\\d+)$")
    public void ingresoConMiIPhoneXSDeDimensionesY(int arg1, int arg2) throws Throwable {
        Assert.assertTrue(msisdnPage.msisdnPageVisualizada());
    }

    @Given("^Ingreso con mi iPhone-XS-Max de dimensiones (\\d+) y (\\d+)$")
    public void ingresoConMiIPhoneXSMaxDeDimensionesY(int arg1, int arg2) throws Throwable {
        Assert.assertTrue(msisdnPage.msisdnPageVisualizada());
    }

    @Given("^Ingreso con mi Sony-Xperia-Z de dimensiones (\\d+) y (\\d+)$")
    public void ingresoConMiSonyXperiaZDeDimensionesY(int arg1, int arg2) throws Throwable {
        Assert.assertTrue(msisdnPage.msisdnPageVisualizada());
    }

    @Given("^Ingreso con mi Sony-Xperia-Z(\\d+) de dimensiones (\\d+) y (\\d+)$")
    public void ingresoConMiSonyXperiaZDeDimensionesY(int arg1, int arg2, int arg3) throws Throwable {
        Assert.assertTrue(msisdnPage.msisdnPageVisualizada());
    }

    @Given("^Ingreso con mi Redmi-Note-(\\d+)-Pro de dimensiones (\\d+) y (\\d+)$")
    public void ingresoConMiRedmiNoteProDeDimensionesY(int arg1, int arg2, int arg3) throws Throwable {
        Assert.assertTrue(msisdnPage.msisdnPageVisualizada());
    }

    @Given("^Ingreso con mi Redmi-Note-(\\d+) de dimensiones (\\d+) y (\\d+)$")
    public void ingresoConMiRedmiNoteDeDimensionesY(int arg1, int arg2, int arg3) throws Throwable {
        Assert.assertTrue(msisdnPage.msisdnPageVisualizada());
    }

    @Given("^Ingreso con mi Google-Pixel de dimensiones (\\d+) y (\\d+)$")
    public void ingresoConMiGooglePixelDeDimensionesY(int arg1, int arg2) throws Throwable {
        Assert.assertTrue(msisdnPage.msisdnPageVisualizada());
    }

    @Given("^Ingreso con mi Microsoft-Lumia-(\\d+) de dimensiones (\\d+) y (\\d+)$")
    public void ingresoConMiMicrosoftLumiaDeDimensionesY(int arg1, int arg2, int arg3) throws Throwable {
        Assert.assertTrue(msisdnPage.msisdnPageVisualizada());
    }

    @Given("^Ingreso con mi Blackberry-Leap de dimensiones (\\d+) y (\\d+)$")
    public void ingresoConMiBlackberryLeapDeDimensionesY(int arg1, int arg2) throws Throwable {
        Assert.assertTrue(msisdnPage.msisdnPageVisualizada());
    }

    @Given("^Ingreso con mi LG-Optimus-G de dimensiones (\\d+) y (\\d+)$")
    public void ingresoConMiLGOptimusGDeDimensionesY(int arg1, int arg2) throws Throwable {
        Assert.assertTrue(msisdnPage.msisdnPageVisualizada());
    }

    @Given("^Ingreso con mi Galaxy-Nexus de dimensiones (\\d+) y (\\d+)$")
    public void ingresoConMiGalaxyNexusDeDimensionesY(int arg1, int arg2) throws Throwable {
        Assert.assertTrue(msisdnPage.msisdnPageVisualizada());
    }

    @Given("^Ingreso con mi Galaxy-Note de dimensiones (\\d+) y (\\d+)$")
    public void ingresoConMiGalaxyNoteDeDimensionesY(int arg1, int arg2) throws Throwable {
        Assert.assertTrue(msisdnPage.msisdnPageVisualizada());
    }

    @Given("^Ingreso con mi Galaxy-Note-(\\d+) de dimensiones (\\d+) y (\\d+)$")
    public void ingresoConMiGalaxyNoteDeDimensionesY(int arg1, int arg2, int arg3) throws Throwable {
        Assert.assertTrue(msisdnPage.msisdnPageVisualizada());
    }

    @Given("^Ingreso con mi Kindle-Fire-HD-(\\d+) de dimensiones (\\d+) y (\\d+)$")
    public void ingresoConMiKindleFireHDDeDimensionesY(int arg1, int arg2, int arg3) throws Throwable {
        Assert.assertTrue(msisdnPage.msisdnPageVisualizada());
    }

    @Given("^Ingreso con mi Xperia-P de dimensiones (\\d+) y (\\d+)$")
    public void ingresoConMiXperiaPDeDimensionesY(int arg1, int arg2) throws Throwable {
        Assert.assertTrue(msisdnPage.msisdnPageVisualizada());
    }

    @Given("^Ingreso con mi Galaxy-S(\\d+)-Ultra de dimensiones (\\d+) y (\\d+)$")
    public void ingresoConMiGalaxySUltraDeDimensionesY(int arg1, int arg2, int arg3) throws Throwable {
        Assert.assertTrue(msisdnPage.msisdnPageVisualizada());
    }
}
