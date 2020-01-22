package co.com.choucair.certification.mercurytours.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {
    public static final Target EMAIL = Target.the("email field")
            .located(By.name("userName"));

    public static final Target PASSWORD = Target.the("password")
            .located(By.name("password"));

    public static final Target LOGINBUTTON = Target.the("login")
            .located(By.name("login"));

    private LoginPage() {
    }
}
