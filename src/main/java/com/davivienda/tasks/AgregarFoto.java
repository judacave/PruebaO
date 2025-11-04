package com.davivienda.tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;

import java.nio.file.Paths;

import static com.davivienda.userinterface.EmpleadoPage.IMG_PERFIL;
import static com.davivienda.userinterface.EmpleadoPage.INPUT_FOTO_EDITAR;
import static com.davivienda.userinterface.RegistrarEmpleadoPage.BTN_ADD_FOTO;
import static com.davivienda.userinterface.RegistrarEmpleadoPage.BTN_SAVE;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AgregarFoto implements Task {

    private final String nombreArchivo;

    public AgregarFoto(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String rutaAbsoluta = Paths.get("src/test/resources/data/fotos/", nombreArchivo)
                .toAbsolutePath()
                .toString();
        actor.attemptsTo(
                Click.on(IMG_PERFIL),
                Click.on(BTN_ADD_FOTO),
                SendKeys.of(rutaAbsoluta).into(INPUT_FOTO_EDITAR),
                Click.on(BTN_SAVE)
        );
    }

    public static AgregarFoto llamada(String nombreArchivo) {
        return instrumented(AgregarFoto.class, nombreArchivo);
    }
}
