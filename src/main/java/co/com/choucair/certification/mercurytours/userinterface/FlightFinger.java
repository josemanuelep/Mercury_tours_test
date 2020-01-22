package co.com.choucair.certification.mercurytours.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class FlightFinger {

    public static final Target CHECKBOXES_TYPE = Target.the("Trip type").located(By.name("tripType"));
    public static final Target SELECT_PASSANGERS = Target.the("Passangers").located(By.name("passCount"));
    public static final Target SELECT_FROM_PORT = Target.the("From").located(By.name("fromPort"));
    public static final Target SELECT_TO_PORT = Target.the("to").located(By.name("toPort"));
    public static final Target FROM_MONTH = Target.the("From month").located(By.name("fromMonth"));
    public static final Target FROM_DAY = Target.the("From day").located(By.name("fromDay"));
    public static final Target RETURN_MONTH = Target.the("to month").located(By.name("toMonth"));
    public static final Target RETURN_DAY = Target.the("to day").located(By.name("toDay"));
    public static final Target CHECKBOXES_CLASS = Target.the("Class type").located(By.name("servClass"));
    public static final Target BTN_NEXT = Target.the("Button next in fingers").located(By.name("findFlights"));
    public static final Target BANNER_LOGIN = Target.the("login banner image").located(By.xpath("//IMG[@src='/images/masts/mast_flightfinder.gif']"));
    public static final Target SELECT_AIRLINE = Target.the("Airline select").located(By.name("airline"));

    private FlightFinger() {
    }
}
