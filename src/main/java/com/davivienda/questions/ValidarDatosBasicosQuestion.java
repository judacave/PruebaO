package com.davivienda.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

import static com.davivienda.utils.Utilidades.esperarVisibilidad;

public class ValidarDatosBasicosQuestion implements Question<String> {

    private final Target datosEmpleado;

    public ValidarDatosBasicosQuestion(Target datosEmpleado) {
        this.datosEmpleado = datosEmpleado;
    }

    public static ValidarDatosBasicosQuestion correctos(Target datosEmpleado) {
        return new ValidarDatosBasicosQuestion(datosEmpleado);
    }

    @Override
    public String answeredBy(Actor actor) {
        esperarVisibilidad();
        return datosEmpleado.resolveFor(actor).getText();
    }

}
