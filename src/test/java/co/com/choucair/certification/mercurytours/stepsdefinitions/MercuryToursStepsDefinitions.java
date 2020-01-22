package co.com.choucair.certification.mercurytours.stepsdefinitions;

import co.com.choucair.certification.mercurytours.model.FlightDetails;
import co.com.choucair.certification.mercurytours.model.Passanger;
import co.com.choucair.certification.mercurytours.model.User;
import co.com.choucair.certification.mercurytours.questions.IsBought;
import co.com.choucair.certification.mercurytours.questions.IsLoggedIn;
import co.com.choucair.certification.mercurytours.tasks.*;
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

    @Then("^He should  see the top-screen image of welcome with the route \"([^\"]*)\"$")
    public void heShouldSeeTheTopScreenImageOfWelcomeWithTheRoute(String arg1) {
        theActorInTheSpotlight().should(seeThat(IsLoggedIn.inThe(arg1)));
    }


    @Given("^He Fill Flight Details and Preferences with the data$")
    public void heFillFlightDetailsAndPreferencesWithTheData(List<FlightDetails> flightDetails) {
        theActorCalled("Jose").wasAbleTo(FillFlightFinger.theForm(flightDetails));
    }


    @When("^He select the cheapest both flights$")
    public void heSelectTheCheapestBothFlights() {
        theActorInTheSpotlight().attemptsTo(SelectTheCheapest.flight());
    }

    @When("^He Fill the next book flight form with$")
    public void heFillTheNextBookFlightFormWith(List<Passanger> passangerList) {
        theActorInTheSpotlight().attemptsTo(PassangerFill.theForm(passangerList));
    }

    @Then("^finish the itinerary seeing a message \"([^\"]*)\"$")
    public void finishTheItinerarySeeingAMessage(String arg1) {
        theActorInTheSpotlight().should(seeThat(IsBought.thePassage(arg1)));
    }
}
