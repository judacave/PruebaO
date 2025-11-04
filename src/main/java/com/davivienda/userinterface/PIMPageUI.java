package com.davivienda.userinterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PIMPageUI {
    private PIMPageUI(){}

    public static final Target BTN_ADD = Target
            .the("Boton Anadir Empleado")
            .located(By.xpath("//button[normalize-space()='Add']"));

}
