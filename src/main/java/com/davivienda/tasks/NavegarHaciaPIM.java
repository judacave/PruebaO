package com.davivienda.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.davivienda.userinterface.DashboardPage.TXT_PIM;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class NavegarHaciaPIM implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(TXT_PIM, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(TXT_PIM)
        );
    }

    public static NavegarHaciaPIM navegar() {
        return new NavegarHaciaPIM();
    }
}
