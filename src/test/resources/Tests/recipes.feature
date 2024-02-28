Feature: Retete features

  Scenario: I can access different type of recipes from "Recipes Menu"
    Given I am a user on Mega Image home page
    Then I validate cookie header and click accept cookies button
    When I click Recipes Button
    When I click 'Salate' button
    When I click 'Aperitive' button
    When I click 'Supe' button
    When I click 'Deserturi' button
    When I click 'TartePlacinte' button
    When I click 'ToateRetetele' button
