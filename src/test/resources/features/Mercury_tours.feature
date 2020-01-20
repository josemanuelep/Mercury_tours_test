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
    Then He should  see the top-screen image of welcome

  @Tag3
  Scenario: Searching flights
    Given He Fill Flight Details and Preferences with the data
      | type       | passengers | departing_from | on_month | on_day | departing_to | back_month | back_day | service_class |
      | Round Trip | 1          | Acapulco       | January  | 25     | London       | February   | 15       | Economy class |
    When He select the cheapest both flights
    Then He Fill the next book flight form with and finish the itinerary
      | name        | last_name         | meal | card_number   |
      | Jose Manuel | Echeverri Palacio |      | 1314654611212 |