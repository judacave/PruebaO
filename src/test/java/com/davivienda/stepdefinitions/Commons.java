package com.davivienda.stepdefinitions;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class Commons {
    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }
}
