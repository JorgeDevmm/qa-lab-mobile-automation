package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class LoginScreen extends PageObject {

    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Close\"]")
    private WebElement btnClose;

//    Adjunto evidencias de la 2DA PREGUNTA ,donde se muestro el otro tipo de localizador, y también el código java usado para que funcione.
    @AndroidFindBy(className = "android.widget.ImageButton")
    private WebElement imageButton;

//    Codigo java aplicado
    public void clickImg(){
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        wait.until(ExpectedConditions.elementToBeClickable(imageButton));
        getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        imageButton.click();
    }

        public void clickClose(){

        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        wait.until(ExpectedConditions.elementToBeClickable(btnClose));
        getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        btnClose.click();
    }


}
