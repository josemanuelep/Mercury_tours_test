package co.com.choucair.certification.mercurytours.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {
    public static final Target EMAIL = Target.the("email field")
            .located(By.name("email"));

    public static final Target PASSWORD = Target.the("password")
            .located(By.name("password"));

    public static final Target LOGINBUTTON = Target.the("login")
            .located(By.cssSelector("button.btn.btn-primary.btn-block.ladda-button.fadeIn.animated.btn-lg"));

    public static final Target MESSAGE = Target.the("Message")
            .located(By.id("mainHeader"));
}
