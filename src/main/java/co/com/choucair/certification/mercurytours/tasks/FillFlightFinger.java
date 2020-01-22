package co.com.choucair.certification.mercurytours.tasks;

import co.com.choucair.certification.mercurytours.model.FlightDetails;
import co.com.choucair.certification.mercurytours.userinterface.FlightFinger;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;

import static co.com.choucair.certification.mercurytours.userinterface.FlightFinger.CHECKBOXES_CLASS;
import static co.com.choucair.certification.mercurytours.userinterface.FlightFinger.CHECKBOXES_TYPE;
import static co.com.choucair.certification.mercurytours.util.Constants.INDEX_0;
import static co.com.choucair.certification.mercurytours.util.Constants.INDEX_1;

public class FillFlightFinger implements Task {
    private List<FlightDetails> flightDetailsList;

    public FillFlightFinger(List<FlightDetails> flightDetailsList) {
        this.flightDetailsList = flightDetailsList;
    }

    public static FillFlightFinger theForm(List<FlightDetails> flightDetailsList) {
        return Tasks.instrumented(FillFlightFinger.class, flightDetailsList);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CHECKBOXES_TYPE.resolveAllFor(actor).get(INDEX_0)),
                SelectFromOptions.byVisibleText(this.flightDetailsList.get(INDEX_0).getPassengers().toString()).from(FlightFinger.SELECT_PASSANGERS),
                SelectFromOptions.byVisibleText(this.flightDetailsList.get(INDEX_0).getDepartingFrom()).from(FlightFinger.SELECT_TO_PORT),
                SelectFromOptions.byVisibleText(this.flightDetailsList.get(INDEX_0).getBackMonth()).from(FlightFinger.RETURN_MONTH),
                SelectFromOptions.byVisibleText(this.flightDetailsList.get(INDEX_0).getBackDay()).from(FlightFinger.RETURN_DAY),
                SelectFromOptions.byVisibleText(this.flightDetailsList.get(INDEX_0).getOnMonth()).from(FlightFinger.FROM_MONTH),
                SelectFromOptions.byVisibleText(this.flightDetailsList.get(INDEX_0).getOnDay()).from(FlightFinger.FROM_DAY),
                SelectFromOptions.byVisibleText(this.flightDetailsList.get(INDEX_0).getAirline()).from(FlightFinger.SELECT_AIRLINE),
                Click.on(CHECKBOXES_CLASS.resolveAllFor(actor).get(INDEX_1)),
                Click.on(FlightFinger.BTN_NEXT)
        );
    }
}
