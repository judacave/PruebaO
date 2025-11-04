package com.davivienda.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistrarEmpleadoPage {
    private RegistrarEmpleadoPage(){}
    public static final Target INPUT_FIRST_NAME = Target
            .the("Input primer nombre")
            .located(By.cssSelector("input[placeholder='First Name']"));

    public static final Target INPUT_LAST_NAME = Target
            .the("Input apellido")
            .located(By.cssSelector("input[placeholder='Last Name']"));

    public static final Target INPUT_EMPLOYEE_ID = Target
            .the("Input id empleado")
            .located(By.cssSelector("div[class='oxd-input-group oxd-input-field-bottom-space'] div input[class='oxd-input oxd-input--active']"));

    public static final Target BTN_SAVE= Target
            .the("Boton guardar emplead")
            .located(By.cssSelector("button[type='submit']"));

    public static final Target BTN_ADD_FOTO = Target
            .the("Campo para agregar foto")
            .located(By.xpath("//button[@class='oxd-icon-button oxd-icon-button--solid-main employee-image-action']"));

}
