package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchDetailsScreen extends PageObject {

    //@AndroidFindBy(id="search_input")
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@resource-id=\"com.airbnb.android:id/stays_where_panel_compose\"]/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]")
    private WebElement searchDetailInput;

    @AndroidFindBy(id = "com.airbnb.android:id/input_bar_input")
    private WebElement searchDetailInputText;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.LinearLayout/android.widget.TextView")
    private WebElement firstOption;

    //    @AndroidFindBy(id = "2131430997")
    @AndroidFindBy(id = "com.airbnb.android:id/n2_simple_search_footer_gradient_button")
    private WebElement nextButton;


    @AndroidFindBy(id = "com.airbnb.android:id/n2_simple_search_footer_link")
    private WebElement skipButton;

    @AndroidFindBy(id = "com.airbnb.android:id/map_pill")
    private WebElement skipButtonMap;


//    @AndroidFindBy(id = "2131430822")
    @AndroidFindBy(id= "com.airbnb.android:id/n2_dls_action_footer_gradient_button")
    private WebElement searchButton;

    //    espera
    public void esperaElemento(WebElement elemento) {
        try {
            WebDriverWait wait = new WebDriverWait(getDriver(), 20);
            wait.until(ExpectedConditions.elementToBeClickable(elemento));
        } catch (Exception e) {
//            e.getMessage();
//            System.out.println("El error es " + e);
        }
    }


    public void enterSearchInput(String place) {
        /*
        try{
            Thread.sleep(5000);
        }catch (InterruptedException e){
            throw new RuntimeException();
        }
        */
        String cmd = "adb shell input keyevent 66";
        try {
            esperaElemento(searchDetailInput);
            searchDetailInput.click();


            esperaElemento(searchDetailInputText);
            searchDetailInputText.sendKeys(place);
            Runtime.getRuntime().exec(cmd);
        } catch (Exception e) {
        }
    }

    public void clickFirstOption() {
        firstOption.click();
    }

    public void clickNext() {
        esperaElemento(nextButton);
        nextButton.click();
    }

    public void clicSkip() {

        esperaElemento(skipButton);

        skipButton.click();
    }

    public void clickSearch() {

        searchButton.click();
        esperaElemento(searchButton);
    }

    public void clicIconoMap() {
        skipButtonMap.click();
    }
}
