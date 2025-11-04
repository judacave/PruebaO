package com.davivienda.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.davivienda.userinterface.PIMPageUI.BTN_ADD;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AgregarNuevoEmpleado implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_ADD, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BTN_ADD)
        );
    }

    public static AgregarNuevoEmpleado agregar() {
        return new AgregarNuevoEmpleado();
    }

}
