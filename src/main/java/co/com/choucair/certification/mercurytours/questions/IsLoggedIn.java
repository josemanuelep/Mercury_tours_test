package co.com.choucair.certification.mercurytours.questions;

import net.serenitybdd.core.pages.WebElementExpectations;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Attribute;

import static co.com.choucair.certification.mercurytours.userinterface.FlightFinger.BANNER_LOGIN;

public class IsLoggedIn implements Question<Boolean> {

    private String welcomeImageSrc;

    public IsLoggedIn(String src) {
        this.welcomeImageSrc = src;
    }

    public static IsLoggedIn inThe(String question) {
        return new IsLoggedIn(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        String banner = BANNER_LOGIN.resolveFor(actor).getAttribute("src");
        return (this.welcomeImageSrc.equals(banner));
    }
}
