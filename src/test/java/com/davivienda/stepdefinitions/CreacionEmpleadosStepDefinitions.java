package com.davivienda.stepdefinitions;

import com.davivienda.models.Empleado;
import com.davivienda.questions.ValidarDatosBasicosQuestion;

import com.davivienda.tasks.AbrirPaginaPrincipal;
import com.davivienda.tasks.AgregarFoto;
import com.davivienda.tasks.AgregarNuevoEmpleado;
import com.davivienda.tasks.FiltrarPorNombre;
import com.davivienda.tasks.IniciarSesion;
import com.davivienda.tasks.NavegarHaciaPIM;
import com.davivienda.tasks.RegistrarEmpleado;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;

import static com.davivienda.userinterface.DirectoryPage.TXT_DATOS_EMPLEADO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class CreacionEmpleadosStepDefinitions {

    @Given("que el usuario administrador ha iniciado sesion en OrangeHRM")
    public void iniciarSesion() {
        theActorCalled("Administrador").wasAbleTo(
                AbrirPaginaPrincipal.enLaPaginaPrincipal()
        );
        theActorInTheSpotlight().attemptsTo(
                IniciarSesion.conCredenciales()
        );
    }

    @When("el administrador navega al modulo de PIM")
    public void navegarHaciaPIM() {
        theActorInTheSpotlight().attemptsTo(
                NavegarHaciaPIM.navegar()
        );
    }

    @When("selecciona la opcion para agregar un nuevo empleado")
    public void agregarNuevoEmpleado() {
        theActorInTheSpotlight().attemptsTo(
                AgregarNuevoEmpleado.agregar()
        );
    }

    @When("diligencia la informacion del empleado:")
    public void registrarEmpleado(Map<String, String> datosEmpleado) {
        theActorInTheSpotlight().attemptsTo(
                RegistrarEmpleado.conDatosBasicos(datosEmpleado)
        );
    }

    @When("agrega la foto de perfil")
    public void agregarFotoPerfil() {
        theActorInTheSpotlight().attemptsTo(
                AgregarFoto.llamada("Employee.jpg")
        );
    }

    @Then("realiza una busqueda por filtro de nombre en Directory")
    public void hacerBusquedaPorFiltro() {
        Empleado empleado = theActorInTheSpotlight().recall("empleado");
        theActorInTheSpotlight().attemptsTo(
                FiltrarPorNombre.conNombre(empleado)
        );
    }

    @Then("el empleado deberia aparecer en la lista de empleados")
    public void validarExistenciaEmpleado() {
        Empleado empleado = theActorInTheSpotlight().recall("empleado");
        String nombreCompleto = empleado.getPrimerNombre() + " " + empleado.getApellido();
        theActorInTheSpotlight().should(
                seeThat(ValidarDatosBasicosQuestion.correctos(TXT_DATOS_EMPLEADO), equalTo(nombreCompleto))
        );
    }

}
