package com.davivienda.userinterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {
    private LoginPage(){}

    public static final Target INPUT_USER = Target
            .the("Input para user")
            .located(By.cssSelector("input[placeholder='Username']"));
    public static final Target INPUT_PASSWORD = Target
            .the("Input para password")
            .located(By.cssSelector("input[placeholder='Password']"));
    public static final Target TXT_LOGIN_TITLE = Target
            .the("Titulo del login")
            .located(By.cssSelector(".oxd-text.oxd-text--h5.orangehrm-login-title"));

    public static final Target BTN_LOGIN = Target
            .the("Boton de Login")
            .located(By.cssSelector("button[type='submit']"));

}
