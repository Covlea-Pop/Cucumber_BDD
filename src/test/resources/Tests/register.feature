Feature: Register features



  Scenario: Missing phone/email
    Given I am a user on Mega Image home page
    Then I validate cookie header and click accept cookie button
    When I click 'Contul Meu' button
    When I click 'Continua' button
    Then I Validate error msg: Te rugam sa introduci adresa de e-mail sau numarul de telefon

