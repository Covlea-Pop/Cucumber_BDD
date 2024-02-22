Feature: Shopping cart features:



  Scenario: I can delete a product from shopping cart
    Given I am a user on Mega Image home page
    Then I validate cookie header and click accept cookie button
    When I click 'Adauga' button with index: 1
    When I click 'Shopping Cart' button
