package co.com.choucair.certification.mercurytours.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class Sigin {

    public static final Target INPUT_FIRST_NAME = Target.the("Button continue in fligths prices").located(By.name("firstName"));
    public static final Target INPUT_LAST_NAME = Target.the("Button continue in fligths prices").located(By.name("lastName"));
    public static final Target INPUT_EMAIL = Target.the("Button continue in fligths prices").located(By.name("userName"));
    public static final Target INPUT_ADDRESS_1 = Target.the("Button continue in fligths prices").located(By.name("address1"));
    public static final Target INPUT_ADDRESS_2 = Target.the("Button continue in fligths prices").located(By.name("address2"));
    public static final Target INPUT_CITY = Target.the("Button continue in fligths prices").located(By.name("city"));
    public static final Target INPUT_STATE = Target.the("Button continue in fligths prices").located(By.name("state"));
    public static final Target INPUT_POSTAL_CODE = Target.the("Button continue in fligths prices").located(By.name("postalCode"));
    public static final Target INPUT_COUNTRY = Target.the("Button continue in fligths prices").located(By.name("country"));
    public static final Target INPUT_USERNAME = Target.the("Button continue in fligths prices").located(By.name("email"));
    public static final Target INPUT_PASSWORD = Target.the("Button continue in fligths prices").located(By.name("password"));
    public static final Target INPUT_CONFIRM_PASSWORD = Target.the("Button continue in fligths prices").located(By.name("confirmPassword"));
    public static final Target BTN_REGISTER = Target.the("Button continue in fligths prices").located(By.name("register"));
    public static final Target BTN_HEADER = Target.the("Button continue in fligths prices").located(By.xpath("//td[@class='mouseOut']/a"));

    private Sigin() {
    }

    public static Target getSiginGrettigs(String name) {

        String sigInGreting = "(//B[text()=' Dear " + name + ",'])[1]";
        return Target.the("Sigin Gretings").located(By.xpath(sigInGreting));
    }
}
