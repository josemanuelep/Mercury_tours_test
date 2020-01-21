package co.com.choucair.certification.mercurytours.tasks;

import co.com.choucair.certification.mercurytours.interactions.SelectCheaptesFlight;
import co.com.choucair.certification.mercurytours.model.FlightDetails;
import co.com.choucair.certification.mercurytours.userinterface.FlightFinger;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;

import static co.com.choucair.certification.mercurytours.util.Constants.INDEX;

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
                SelectFromOptions.byVisibleText(this.flightDetailsList.get(INDEX).getDepartingFrom()).from(FlightFinger.SELECT_TO_PORT),
                SelectFromOptions.byVisibleText(this.flightDetailsList.get(INDEX).getBackMonth()).from(FlightFinger.RETURN_MONTH),
                SelectFromOptions.byVisibleText(this.flightDetailsList.get(INDEX).getBackDay()).from(FlightFinger.RETURN_DAY),
                Click.on(FlightFinger.BTN_NEXT),
                SelectCheaptesFlight.theCheap()
        );
    }
}
