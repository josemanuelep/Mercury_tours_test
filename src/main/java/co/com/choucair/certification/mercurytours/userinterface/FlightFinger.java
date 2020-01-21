package co.com.choucair.certification.mercurytours.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class FlightFinger {

    public static final Target SELECT_TO_PORT = Target.the("login").located(By.name("toPort"));
    public static final Target RETURN_MONTH = Target.the("login").located(By.name("toMonth"));
    public static final Target RETURN_DAY = Target.the("login").located(By.name("toDay"));
    public static final Target BTN_NEXT = Target.the("login").located(By.name("findFlights"));
    public static final Target BANNER_LOGIN = Target.the("login").located(By.xpath("//IMG[@src='/images/masts/mast_flightfinder.gif']"));

    private FlightFinger() {
    }
}
