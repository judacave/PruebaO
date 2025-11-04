package com.davivienda.tasks;

import com.davivienda.models.Empleado;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.davivienda.userinterface.DashboardPage.TXT_DIRECTORY;
import static com.davivienda.userinterface.DirectoryPage.INPUT_NOMBRE_EMPLEADO;
import static com.davivienda.userinterface.DirectoryPage.OPCION_SUGERIDA;
import static com.davivienda.userinterface.RegistrarEmpleadoPage.BTN_SAVE;
import static com.davivienda.utils.Utilidades.esperarVisibilidad;


public class FiltrarPorNombre implements Task {
    private final Empleado empleado;
    public FiltrarPorNombre(Empleado empleado) {
        this.empleado = empleado;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(TXT_DIRECTORY),
                Click.on(INPUT_NOMBRE_EMPLEADO),
                Enter.theValue(empleado.getPrimerNombre()).into(INPUT_NOMBRE_EMPLEADO)
        );
        esperarVisibilidad();
        actor.attemptsTo(
                Click.on(OPCION_SUGERIDA),
                Click.on(BTN_SAVE)
        );

    }

    public static FiltrarPorNombre conNombre(Empleado empleado) {
        return Tasks.instrumented(FiltrarPorNombre.class, empleado);
    }

}
