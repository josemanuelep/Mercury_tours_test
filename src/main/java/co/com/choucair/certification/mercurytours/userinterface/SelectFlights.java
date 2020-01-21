package co.com.choucair.certification.mercurytours.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class SelectFlights {
    public static final Target BTN_CONTINUE = Target.the("login").located(By.name("reserveFlights"));
    public static final Target CHECKBOXES_OUT_FLIGHT = Target.the("login").located(By.name("outFlight"));
    public static final Target CHECKBOXES_RETURN_FLIGHT = Target.the("login").located(By.name("inFlight"));
    private SelectFlights() {}
}
