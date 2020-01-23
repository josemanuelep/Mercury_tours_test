package co.com.choucair.certification.mercurytours.questions;

import co.com.choucair.certification.mercurytours.userinterface.Sigin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class IsSignin implements Question<Boolean> {
    private String message;

    public IsSignin(String message) {
        this.message = message;
    }

    public static IsSignin inThePage(String msm) {
        return new IsSignin(msm);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String msmToCompare = Sigin.getSiginGrettigs("Jose Manuel Echeverri Palacio").resolveFor(actor).getText();
        System.out.println(msmToCompare+" - "+this.message);
        return (this.message.equals(msmToCompare));
    }
}
