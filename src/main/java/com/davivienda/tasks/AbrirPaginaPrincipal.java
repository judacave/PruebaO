package com.davivienda.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirPaginaPrincipal implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn().thePageNamed("webdriver.base.url")
        );
    }

    public static AbrirPaginaPrincipal enLaPaginaPrincipal() {
        return new AbrirPaginaPrincipal();
    }
}
