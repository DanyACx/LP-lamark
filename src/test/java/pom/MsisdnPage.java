package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MsisdnPage extends BasePage{

    public MsisdnPage(WebDriver driver){
        super(driver);
    }

    // elementos de la page msisdn
    By tituloPageLocator = By.xpath("/html/body/app-root/app-subscribe-page/div/app-request-page/div/h2");
    By inputMsisdnLocator = By.name("phoneNumber");
    By botonSuscribeLocator = By.xpath("/html/body/app-root/app-subscribe-page/div/app-request-page/div/div[3]/button[1]");
    By textoPinCodePageLocator = By.xpath("/html/body/app-root/app-subscribe-page/div/app-verify-page/div/label[1]");

    String msisdnTituloPage = "Disney Language Learning";
    String textoPinCodePage = "Please enter the Pin you received to activate your subscription:";

    public boolean msisdnPageVisualizada() throws Exception {
       // Thread.sleep(4000);
        this.esperaExplicitaTexto(tituloPageLocator, msisdnTituloPage);
        return this.obtenerTexto(tituloPageLocator).equals(msisdnTituloPage);
    }

    public void ingresarNumero(String textoIngresado) throws Exception {
        this.ingresarTexto(textoIngresado, inputMsisdnLocator);
    }

    public void hacerClick() throws Exception {
        this.esperaExplicitaClick(botonSuscribeLocator);
        this.click(botonSuscribeLocator);
        // Thread.sleep(2000);
    }

    public boolean seVisualizaPinCodePage() throws Exception {
        //Thread.sleep(2000);
        this.esperaExplicitaTexto(textoPinCodePageLocator, textoPinCodePage);
        return this.seVisualiza(textoPinCodePageLocator);
    }
}
