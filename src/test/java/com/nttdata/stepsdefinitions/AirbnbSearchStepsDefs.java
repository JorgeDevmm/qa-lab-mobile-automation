package com.nttdata.stepsdefinitions;

import com.nttdata.steps.AirbnbSearchSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

import java.io.File;

public class AirbnbSearchStepsDefs {

    @Steps
    AirbnbSearchSteps airbnbSearchSteps;

//    @Given("que me enuentro en el login de Airbnb")
//    public void que_me_encuentro_en_el_login_de_airbnb() {
//
//        airbnbSearchSteps.clickClose();
//    }

    @Given("que me encuentro en el login de Airbnb")
    public void queMeEncuentroEnElLoginDeAirbnb() {
        airbnbSearchSteps.clickClose();
    }

    @When("busco {string}")
    public void busco(String place) {
        airbnbSearchSteps.searchByText(place);
    }

    @Then("muestra el texto {string}")
    public void muestra_el_texto(String text) {

        Assert.assertEquals(airbnbSearchSteps.getResultText(), text);
    }


    @And("hago clic en el boton skip")
    public void hagoClicEnElBotonSkip() {
        airbnbSearchSteps.clicSkip();
    }

    @And("hago clic en Search")
    public void hagoClicEnSearch() {
        airbnbSearchSteps.clicSearch();
    }

    @And("hago clic en icono Map")
    public void hagoClicEnIconoMap() {
        airbnbSearchSteps.clicMap();
    }


}
