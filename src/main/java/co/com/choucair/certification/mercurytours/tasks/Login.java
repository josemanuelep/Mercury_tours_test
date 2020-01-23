package co.com.choucair.certification.mercurytours.tasks;

import co.com.choucair.certification.mercurytours.model.User;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.choucair.certification.mercurytours.userinterface.LoginPage.*;
import static co.com.choucair.certification.mercurytours.util.Constants.INDEX_0;

public class Login implements Task {
    private List<User> users;

    public Login(List<User> users) {
        this.users = users;
    }

    public static Login with(List<User> loginData) {
        return Tasks.instrumented(Login.class, loginData);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(users.get(INDEX_0).getEmail()).into(EMAIL),
                Enter.theValue(users.get(INDEX_0).getPassword()).into(PASSWORD),
                Click.on(LOGINBUTTON)
        );
    }
}
