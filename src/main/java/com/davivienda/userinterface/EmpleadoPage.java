package com.davivienda.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class EmpleadoPage {
    private EmpleadoPage(){}

    public static final Target IMG_PERFIL = Target
            .the("Img de perfil")
            .located(By.cssSelector(".orangehrm-edit-employee-image"));

    public static final Target INPUT_FOTO_EDITAR = Target
            .the("Editar img perfil")
            .located(By.xpath("//input[@type='file']"));

    public static final Target TXT_PERSONAL_DETAILS = Target
            .the("Titulo de detalles personales")
            .located(By.xpath("//a[normalize-space()='Personal Details']"));
}
