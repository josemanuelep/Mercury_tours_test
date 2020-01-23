package co.com.choucair.certification.mercurytours.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

import java.util.List;

public class SelectHeader implements Interaction {
    private List<WebElementFacade> listHeader;
    private String header;

    public SelectHeader(List<WebElementFacade> listHeader, String header) {
        this.listHeader = listHeader;
        this.header = header;
    }

    public static SelectHeader goToForm(List<WebElementFacade> listHeader, String text) {
        return Tasks.instrumented(SelectHeader.class, listHeader, text);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        for (WebElementFacade webElementFacade : this.listHeader) {
            if (webElementFacade.getText().equals(this.header)) {
                webElementFacade.click();
                break;
            }
        }
    }
}
