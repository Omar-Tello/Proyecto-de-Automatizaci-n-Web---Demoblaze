package com.nttdata.testing.Pages;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

@DefaultUrl("https://www.demoblaze.com/")

public class Contacto {

    //  Contact

    public static final Target BTN_CONTACT = Target.the("Boton para hacer el contacto")
            .located(By.cssSelector("a.nav-link[data-target='#exampleModal']"));

    public static final Target REGISTER_MODAL = Target.the("Modal de registro")
            .located(By.id("exampleModalLabel"));

    public static final Target INP_EMAIL = Target.the("emaildelcontacto")
            .located(By.id("recipient-email"));

    public static final Target INP_USERNAME = Target.the("Nombredelcontacto")
            .located(By.id("recipient-name"));

    public static final Target INP_MESSAGE= Target.the("Mensaje")
            .located(By.id("message-text"));

    public static final Target BTN_REGISTRAR = Target.the("Botondeenviar")
            .located(By.xpath("//button[text()='Send message']"));


}

