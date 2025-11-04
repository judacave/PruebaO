package com.davivienda.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DashboardPage {
    private DashboardPage(){}
    public static final Target TXT_PIM = Target
            .the("Opcion PIM")
            .located(By.xpath("//span[normalize-space()='PIM']"));

    public static final Target TXT_DIRECTORY = Target
            .the("Opcion Directory")
            .located(By.xpath("//span[normalize-space()='Directory']"));
}
