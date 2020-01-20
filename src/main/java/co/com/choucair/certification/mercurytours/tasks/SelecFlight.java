package co.com.choucair.certification.mercurytours.tasks;

import co.com.choucair.certification.mercurytours.userinterface.SelectFlights;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

public class SelecFlight implements Task {

    public static SelecFlight theCheap() {
        return Tasks.instrumented(SelecFlight.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SelectFlights.BTN_CONTINUE));
    }
}
