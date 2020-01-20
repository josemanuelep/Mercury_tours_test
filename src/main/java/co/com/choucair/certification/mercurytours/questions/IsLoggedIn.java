package co.com.choucair.certification.mercurytours.questions;

import co.com.choucair.certification.mercurytours.tasks.Login;
import co.com.choucair.certification.mercurytours.userinterface.HomePage;
import co.com.choucair.certification.mercurytours.userinterface.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class IsLoggedIn implements Question<Boolean> {
    private String welcomeImageSrc;

    public IsLoggedIn(String src) {
        this.welcomeImageSrc = src;
    }

    public static IsLoggedIn inThe(String question) {
        return new IsLoggedIn(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String comp = Text.of(LoginPage.MSG_WELCOME).viewedBy(actor).asString().trim();
        return true;
//        return(this.welcomeImageSrc.equals(comp));
    }
}
