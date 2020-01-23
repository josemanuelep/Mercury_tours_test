package co.com.choucair.certification.mercurytours.tasks;

import co.com.choucair.certification.mercurytours.interactions.SelectHeader;
import co.com.choucair.certification.mercurytours.model.Passanger;
import co.com.choucair.certification.mercurytours.util.Constants;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;

import static co.com.choucair.certification.mercurytours.userinterface.Sigin.*;
import static co.com.choucair.certification.mercurytours.util.Constants.INDEX_0;

public class Register implements Task {

    private List<Passanger> passangers;


    public Register(List<Passanger> passangers) {
        this.passangers = passangers;
    }

    public static Register inTheForm(List<Passanger> passangers) {
        return Tasks.instrumented(Register.class, passangers);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectHeader
                .goToForm(BTN_HEADER.resolveAllFor(actor),"REGISTER"),
                Enter.theValue(passangers.get(Constants.INDEX_0).getName()).into(INPUT_FIRST_NAME),
                Enter.theValue(passangers.get(Constants.INDEX_0).getLastName()).into(INPUT_LAST_NAME),
                Enter.theValue(passangers.get(Constants.INDEX_0).getMail()).into(INPUT_EMAIL),
                Enter.theValue(passangers.get(Constants.INDEX_0).getAddress1()).into(INPUT_ADDRESS_1),
                Enter.theValue(passangers.get(Constants.INDEX_0).getAddress2()).into(INPUT_ADDRESS_2),
                Enter.theValue(passangers.get(Constants.INDEX_0).getCity()).into(INPUT_CITY),
                Enter.theValue(passangers.get(Constants.INDEX_0).getState()).into(INPUT_STATE),
                SelectFromOptions.byVisibleText(passangers.get(INDEX_0).getCountry()).from(INPUT_COUNTRY),
                Enter.theValue(passangers.get(Constants.INDEX_0).getPostalCode().toString()).into(INPUT_POSTAL_CODE),
                Enter.theValue(passangers.get(Constants.INDEX_0).getMail()).into(INPUT_USERNAME),
                Enter.theValue(passangers.get(Constants.INDEX_0).getPassword()).into(INPUT_PASSWORD),
                Enter.theValue(passangers.get(Constants.INDEX_0).getPassword()).into(INPUT_CONFIRM_PASSWORD),
                Click.on(BTN_REGISTER)
        );
    }
}
