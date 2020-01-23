# Autor Jose Manuel Echeverri Palacio
# Testing project at Choucair company

@Tag1
Feature: Tours fly
  As turist I want to see the Flights
  adn admin the depart and the return

  Background: Login into the mercury app
    Given Given that Jose wants to enter to mercury tours with the credencials
      | email | password |
      | demo  | demo     |

  @Tag2
  Scenario: Login
    Then He should  see the top-screen image of welcome with the route "http://newtours.demoaut.com/images/masts/mast_flightfinder.gif"

  @Tag3
  Scenario: Searching flights
    Given He Fill Flight Details and Preferences with the data
      | type    | passengers | departingFrom | airline          | onMonth | onDay | departingTo | backMonth | backDay | serviceClass  |
      | One Way | 1          | London        | Unified Airlines | January | 25    | New York    | April     | 18      | Economy class |
    When He select the cheapest both flights
    And He Fill the next book flight form with
      | name        | lastName          | meal  | cardNumber    |
      | Jose Manuel | Echeverri Palacio | Hindu | 1314654611212 |
    Then finish the itinerary seeing a message "Your itinerary has been booked!"


