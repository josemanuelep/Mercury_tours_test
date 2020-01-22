package co.com.choucair.certification.mercurytours.tasks;

import co.com.choucair.certification.mercurytours.model.Passanger;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;

import static co.com.choucair.certification.mercurytours.userinterface.PassangersData.*;
import static co.com.choucair.certification.mercurytours.util.Constants.INDEX_0;

public class PassangerFill implements Task {
    private List<Passanger> passangers;

    public PassangerFill(List<Passanger> passangers) {
        this.passangers = passangers;
    }

    public static PassangerFill theForm (List<Passanger> passangers){
        return Tasks.instrumented(PassangerFill.class,passangers);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(passangers.get(INDEX_0).getName()).into(INPUT_NAME),
                Enter.theValue(passangers.get(INDEX_0).getLastName()).into(INPUT_LASTNAME),
                SelectFromOptions.byVisibleText(passangers.get(INDEX_0).getMeal()).from(SELECT_MEALS),
                Enter.theValue(passangers.get(INDEX_0).getCardNumber().toString()).into(INPUT_CREDIT_NUMBER),
                Click.on(BNT_BUY)
        );
    }
}


