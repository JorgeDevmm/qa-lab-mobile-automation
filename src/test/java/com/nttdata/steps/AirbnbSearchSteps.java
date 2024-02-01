package com.nttdata.steps;

import com.nttdata.screens.LoginScreen;
import com.nttdata.screens.SearchDetailsScreen;
import com.nttdata.screens.SearchScreen;
import net.thucydides.core.annotations.Step;

public class AirbnbSearchSteps {

    LoginScreen loginScreen;
    SearchScreen searchScreen;
    SearchDetailsScreen searchDetailsScreen;

    @Step("Click en cerrar")
    public void clickClose() {
        loginScreen.clickClose();
    }

    @Step("Búsqueda por texto {0}")
    public void searchByText(String place) {
        searchDetailsScreen.enterSearchInput(place);
    }

    @Step("Obtiene el texto del resultado")
    public String getResultText() {
        return searchScreen.getResultText();
    }

    public void clicSkip() {
        searchDetailsScreen.clicSkip();
    }

    public void clicSearch() {
        searchDetailsScreen.clickSearch();
    }

    public void clicMap() {
        searchDetailsScreen.clicIconoMap();
    }

    public void clicInput() {
        searchScreen.clickSearchInput();
    }


}
