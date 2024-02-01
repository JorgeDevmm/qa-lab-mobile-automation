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

    @Given("me encuentro en la pagina inicio de sesion y cierro la ventana")
    public void meEncuentroEnLaPaginaInicioDeSesionYCierroLaVentana() {
        airbnbSearchSteps.clickClose();
    }

    @When("se visualiza pagina principal, e ingreso el lugar o hospedaje a buscar en la ventana de texto")
    public void seVisualizaPaginaPrincipalEIngresoElLugarOHospedajeABuscarEnLaVentanaDeTexto() {
        airbnbSearchSteps.clicInput();
    }

    @And("busco {string}")
    public void busco(String place) {
        airbnbSearchSteps.searchByText(place);
    }


    @Then("valido el texto {string}")
    public void validoElTexto(String text) {
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
