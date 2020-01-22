package co.com.choucair.certification.mercurytours.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.choucair.certification.mercurytours.userinterface.FlightFinger.BANNER_LOGIN;
import static co.com.choucair.certification.mercurytours.userinterface.PassangersData.LABEL_SUCCES_BUY;

public class IsBought implements Question<Boolean> {
    private String label;

    public IsBought(String label) {
        this.label = label;
    }

    public static IsBought thePassage(String label) {
        return new IsBought(label);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String banner = LABEL_SUCCES_BUY.resolveFor(actor).getText();
        return (this.label.equals(banner));
    }
}
