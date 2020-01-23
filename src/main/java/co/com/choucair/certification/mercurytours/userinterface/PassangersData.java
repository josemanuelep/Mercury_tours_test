package co.com.choucair.certification.mercurytours.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class PassangersData {
    public static final Target INPUT_NAME = Target.the("First name").located(By.name("passFirst0"));
    public static final Target INPUT_LASTNAME = Target.the("Last name").located(By.name("passLast0"));
    public static final Target SELECT_MEALS = Target.the("login").located(By.name("pass.0.meal"));
    public static final Target INPUT_CREDIT_NUMBER = Target.the("login").located(By.name("creditnumber"));
    public static final Target BNT_BUY = Target.the("login").located(By.name("buyFlights"));
    public static final Target LABEL_SUCCES_BUY = Target.the("login").located(By.xpath("//FONT[@size='+1']"));
    private PassangersData() {
    }
}
