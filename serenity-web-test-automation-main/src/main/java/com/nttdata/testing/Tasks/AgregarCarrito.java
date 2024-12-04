package com.nttdata.testing.Tasks;

import com.nttdata.testing.Pages.PaginaProducto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class AgregarCarrito implements Task
{
    private final PaginaProducto productPages = new PaginaProducto();
    private String productName;

    public AgregarCarrito(String productName)
    {
        this.productName = productName;
    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {

        actor.attemptsTo(
                Click.on(PaginaProducto.getProductNameTarget(productName)),
                Click.on(PaginaProducto.BTN_ADD_TO_CAR)
        );

        System.out.println("\u001B[32m" + "Alert message: "+ productPages.getAlertMessage() + "\u001B[37m");
    }

    public static Performable withData(String productName)
    {
        return new AgregarCarrito(productName);
    }
}
