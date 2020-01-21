package co.com.choucair.certification.mercurytours.interactions;

import co.com.choucair.certification.mercurytours.userinterface.SelectFlights;
import co.com.choucair.certification.mercurytours.util.GetCheapest;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import java.util.List;

import static co.com.choucair.certification.mercurytours.userinterface.SelectFlights.CHECKBOXES_OUT_FLIGHT;
import static co.com.choucair.certification.mercurytours.userinterface.SelectFlights.CHECKBOXES_RETURN_FLIGHT;

public class SelectCheaptesFlight implements Interaction {

    public static SelectCheaptesFlight theCheap() {
        return Tasks.instrumented(SelectCheaptesFlight.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        List<WebElementFacade> listOutFlights = CHECKBOXES_OUT_FLIGHT.resolveAllFor(actor);
        List<WebElementFacade> listBackFlights = CHECKBOXES_RETURN_FLIGHT.resolveAllFor(actor);
        actor.attemptsTo(
                Click.on(GetCheapest.flight(listOutFlights)),
                Click.on( GetCheapest.flight(listBackFlights)),
                Click.on(SelectFlights.BTN_CONTINUE)
        );
    }
}
