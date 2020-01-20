package co.com.choucair.certification.mercurytours.stepsdefinitions;

import co.com.choucair.certification.mercurytours.model.FlightDetails;
import co.com.choucair.certification.mercurytours.model.Passanger;
import co.com.choucair.certification.mercurytours.model.User;
import co.com.choucair.certification.mercurytours.questions.IsLoggedIn;
import co.com.choucair.certification.mercurytours.tasks.FillFlightFinger;
import co.com.choucair.certification.mercurytours.tasks.Login;
import co.com.choucair.certification.mercurytours.tasks.OpenThe;
import co.com.choucair.certification.mercurytours.tasks.SelecFlight;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class MercuryToursStepsDefinitions {
    @Given("^Given that Jose wants to enter to mercury tours with the credencials$")
    public void givenThatJoseWantsToEnterToMercuryToursWithTheCredencials(List<User> users) {
        theActorCalled("Jose").wasAbleTo(OpenThe.page(), Login.with(users));
    }


    @Then("^He should  see the top-screen image of welcome$")
    public void heShouldSeeTheTopScreenImageOfWelcome() {
        theActorInTheSpotlight().should(seeThat(IsLoggedIn.inThe("Tours")));
    }

    @Given("^He Fill Flight Details and Preferences with the data$")
    public void heFillFlightDetailsAndPreferencesWithTheData(List<FlightDetails> flightDetails) {
        theActorCalled("Jose").wasAbleTo(FillFlightFinger.theForm(flightDetails));
    }

    @When("^He select the cheapest both flights$")
    public void heSelectTheCheapestBothFlights() {
        theActorInTheSpotlight().attemptsTo(SelecFlight.theCheap());
    }

    @Then("^He Fill the next book flight form with and finish the itinerary$")
    public void heFillTheNextBookFlightFormWithAndFinishTheItinerary(List<Passanger> passangerList) {
// PENDING TO DO
    }
}
