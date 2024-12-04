
package com.nttdata.testing.stepDefinition;
/*
import com.nttdata.testing.Pages.Contacto;
import com.nttdata.testing.Pages.HomePage;
import com.nttdata.testing.Tasks.ContactaUsuario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
*/
public class ContactaUsuario {/*

    @Given("el {actor} está en la página de inicio")
    public void elUsuarioEstaEnLaPaginaDeInicio(Actor actor) {
        actor.attemptsTo(NavigateTo.theHomePage());
    }

    @When("el usuario hace clic en el botón de contacto")
    public void elUsuarioHaceClicEnElBotonDeContacto() {
        theActorInTheSpotlight().attemptsTo(Click.on(HomePage.BTN_CONTACT));
    }

    @And("el usuario ingresa su correo {string}")
    public void elUsuarioIngresaSuCorreo(String email) {
        theActorInTheSpotlight().attemptsTo(Enter.theValue(email).into(Contacto.INP_EMAIL));
    }

    @And("el usuario ingresa su nombre {string}")
    public void elUsuarioIngresaSuNombre(String nombre) {
        theActorInTheSpotlight().attemptsTo(Enter.theValue(nombre).into(Contacto.INP_USERNAME));
    }

    @And("el usuario ingresa su mensaje {string}")
    public void elUsuarioIngresaSuMensaje(String mensaje) {
        theActorInTheSpotlight().attemptsTo(Enter.theValue(mensaje).into(Contacto.INP_MESSAGE));
    }

    @And("el usuario hace clic en el botón de enviar")
    public void elUsuarioHaceClicEnElBotonDeEnviar() {
        theActorInTheSpotlight().attemptsTo(Click.on(Contacto.BTN_ENVIAR));
    }

    @Then("el formulario de contacto se envía exitosamente")
    public void elFormularioDeContactoSeEnvioExitosamente() {
        System.out.println("Formulario enviado exitosamente");
        try {
            Thread.sleep(10000);  // Solo para esperar por la acción, puedes ajustarlo
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @When("el usuario contacta con un correo {string}, nombre {string} y mensaje {string}")
    public void elUsuarioContactaConUnCorreoNombreYMensaje(String email, String nombre, String mensaje) {
        theActorInTheSpotlight().attemptsTo(ContactaUsuario.withData(email, nombre, mensaje));
    }*/
}

