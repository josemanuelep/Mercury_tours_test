@Tag1
Feature: Sigin in the Mercury tour app
  As turist I want to register in the app
  to see the oferts

  @Tag2
  Scenario: Sigin in the Mercury tours page
    Given Open the aplication and go to register form
    When He fills the inputs to register
      | name        | lastName          | userName | mail                      | password | address1        | address2         | city     | state     | country  | cardNumber    | phone | postalCode |
      | Jose Manuel | Echeverri Palacio | jmep     | jose.echeverri@upb.edu.co | 123456   | Cra. 88 # 65-21 | Calle 40 # 26-30 | Medayork | Antioquia | COLOMBIA | 2566545456456 | 55555 | 4564       |
    Then he see a success message