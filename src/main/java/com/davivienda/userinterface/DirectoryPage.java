package com.davivienda.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DirectoryPage {
    private DirectoryPage(){}
    public static final Target INPUT_NOMBRE_EMPLEADO = Target
            .the("Input nombre empleado")
            .located(By.xpath("//input[@placeholder='Type for hints...']"));

    public static final Target TXT_DATOS_EMPLEADO = Target
            .the("Nombre empleado en el directorio")
            .located(By.xpath("(//p[@class='oxd-text oxd-text--p orangehrm-directory-card-header --break-words'])[1]"));

    public static final Target OPCION_SUGERIDA = Target.the("opción sugerida")
            .located(By.xpath("//div[contains(@class,'oxd-autocomplete-dropdown')]//div[1]"));
}
