package co.com.choucair.certification.mercurytours.tasks;

import co.com.choucair.certification.mercurytours.interactions.SelectCheaptesFlight;
import co.com.choucair.certification.mercurytours.userinterface.SelectFlights;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SelectTheCheapest implements Task {



    public static SelectTheCheapest flight() {
        return Tasks.instrumented(SelectTheCheapest.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(SelectCheaptesFlight.theCheap(), Click.on(SelectFlights.BTN_CONTINUE));
    }
}
