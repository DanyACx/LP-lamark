package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.LogHelper;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BasePage {

    private WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    // metodo para hacer click
    public void click(By locator)  throws Exception{
        try{
            driver.findElement(locator).click();
        }catch (Exception e){
            throw new Exception("No se pudo hacer click sobre el locator: "+locator);
        }
    }

    // metodo para ver si el elemento se visualiza en pantalla
    public boolean seVisualiza(By locator) throws Exception {
        try{
            return driver.findElement(locator).isDisplayed();
        }catch (Exception e){
            throw new Exception("No se puedo encontrar el lemento: "+locator);
        }
    }

    public String obtenerTexto(By locator) throws Exception {
        try{
            return driver.findElement(locator).getText();
        }catch (Exception e){
            throw new Exception("No se pudo obtener el texto del locator: "+locator);
        }
    }

    public void ingresarTexto(String textoIngresado, By locator) throws Exception{
        try{
            driver.findElement(locator).sendKeys(textoIngresado);
        }catch (Exception e){
            throw new Exception("No se pudo ingresar texto: "+locator);
        }

    }

    public WebElement encontrarElemento(By locator) throws Exception {
        try{
            return driver.findElement(locator);
        }catch (Exception e){
            throw new Exception("No se puedo encontrar al elemento: "+locator);
        }
    }

    public void esperaExplicitaClick(By locator){
        WebDriverWait esperaElemento = new WebDriverWait(driver, Duration.ofSeconds(5));
        esperaElemento.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public void esperaExplicitaTexto(By locator, String texto){

            WebDriverWait esperaElemento = new WebDriverWait(driver, Duration.ofSeconds(5));
            esperaElemento.until(ExpectedConditions.textToBe(locator, texto));

    }

    public void esperaExplicitaObjeto(By locator){
        WebDriverWait esperaElemento = new WebDriverWait(driver, Duration.ofSeconds(5));
        esperaElemento.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

}
