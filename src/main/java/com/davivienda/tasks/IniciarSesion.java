package com.davivienda.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.davivienda.userinterface.LoginPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class IniciarSesion implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(TXT_LOGIN_TITLE, isVisible()).forNoMoreThan(15).seconds(),
                Click.on(INPUT_USER),
                Enter.theValue(System.getenv("USER")).into(INPUT_USER),
                Enter.theValue(System.getenv("PASSWORD")).into(INPUT_PASSWORD),
                Click.on(BTN_LOGIN)
        );
    }

    public static IniciarSesion conCredenciales() {
        return new IniciarSesion();
    }
}
