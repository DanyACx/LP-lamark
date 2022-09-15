package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.LogHelper;

import java.util.logging.Level;
import java.util.logging.Logger;

public class PinCodePage extends BasePage{

    public PinCodePage(WebDriver driver){
        super(driver);
    }
    private static final Logger LOGGER = LogHelper.getLogger();

    By inputPinCodeLocator = By.name("pinCode");
    By botonConfirmarLocator = By.xpath("/html/body/app-root/app-subscribe-page/div/app-verify-page/div/div[3]/button[1]");
    By textoSuccessPageLocator = By.xpath("/html/body/app-root/app-subscribe-page/div/app-welcome-page/div/div[2]/h5");

    String textoSuccessPage = "You have been successfully subscribed to Magical English service";


    public void ingresarNumero(String textoIngresado) throws Exception {
        this.esperaExplicitaObjeto(botonConfirmarLocator);
        this.ingresarTexto(textoIngresado, inputPinCodeLocator);
    }

    public void hacerClick() throws Exception {
        this.esperaExplicitaClick(botonConfirmarLocator);
        this.click(botonConfirmarLocator);
        // Thread.sleep(2000);
    }

    public boolean seVisualizaSuccessPage() throws Exception {
        //Thread.sleep(2000);

        try {
            this.esperaExplicitaTexto(textoSuccessPageLocator, textoSuccessPage);
            LOGGER.log(Level.INFO, "Paso la prueba con exito");
            return this.seVisualiza(textoSuccessPageLocator);
        }catch (Exception e){
            LOGGER.log(Level.WARNING, "No paso la prueba");
            throw new Exception("No se puedo encontrar el texto: "+textoSuccessPage);
        }

    }


}
