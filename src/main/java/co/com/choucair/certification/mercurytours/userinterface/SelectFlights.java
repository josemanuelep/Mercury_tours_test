package co.com.choucair.certification.mercurytours.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class SelectFlights {
    public static final Target BTN_CONTINUE = Target.the("Button continue in fligths prices").located(By.name("reserveFlights"));
    public static final Target CHECKBOXES_OUT_FLIGHT = Target.the("CheckBoxes out flight").located(By.name("outFlight"));
    public static final Target CHECKBOXES_RETURN_FLIGHT = Target.the("CheckBoxes return flight").located(By.name("inFlight"));
    private SelectFlights() {}
}
