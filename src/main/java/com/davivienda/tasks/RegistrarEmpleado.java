package com.davivienda.tasks;

import com.davivienda.models.Empleado;
import lombok.SneakyThrows;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.Map;

import static com.davivienda.userinterface.RegistrarEmpleadoPage.*;
import static com.davivienda.utils.Utilidades.generarCodigoAleatorio;
import static com.davivienda.utils.Utilidades.setearDatos;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class RegistrarEmpleado implements Task {
    private final Map<String, String> dataEmpleado;

    public RegistrarEmpleado(Map<String, String> dataEmpleado) {
        this.dataEmpleado = dataEmpleado;
    }

    @SneakyThrows
    @Override
    public <T extends Actor> void performAs(T actor) {
        Empleado empleado = setearDatos(dataEmpleado, Empleado.class);
        actor.remember("empleado", empleado);
        actor.attemptsTo(
                WaitUntil.the(INPUT_FIRST_NAME, isClickable()).forNoMoreThan(10).seconds(),
                Enter.theValue(empleado.getPrimerNombre()).into(INPUT_FIRST_NAME),
                Enter.theValue(empleado.getApellido()).into(INPUT_LAST_NAME),
                Enter.theValue(generarCodigoAleatorio()).into(INPUT_EMPLOYEE_ID),
                Click.on(BTN_SAVE)
        );
    }

    public static RegistrarEmpleado conDatosBasicos(Map<String, String> dataEmpleado) {
        return Tasks.instrumented(RegistrarEmpleado.class, dataEmpleado);
    }
}
