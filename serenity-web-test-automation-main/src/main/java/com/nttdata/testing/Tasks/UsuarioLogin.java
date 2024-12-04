package com.nttdata.testing.Tasks;

import com.nttdata.testing.Pages.login;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class UsuarioLogin implements Task
{
    public Actor actor;
    private final String username;
    private final String password;

    public UsuarioLogin(Actor actor, String username, String password)
    {
        this.username = username;
        this.password = password;
        this.actor = actor;
    }

    public UsuarioLogin(String username, String password)
    {
        this.username = username;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(
                Click.on(login.BTN_LOG_IN),
                Enter.theValue(username).into(login.INP_USERNAME),
                Enter.theValue(password).into(login.INP_PASSWORD),
                Click.on(login.BTN_INGRESAR)
        );
    }

    public static Performable withData(String username, String password)
    {
        return new UsuarioLogin(username, password);
    }

}
