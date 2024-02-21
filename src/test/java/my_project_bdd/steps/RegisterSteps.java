package my_project_bdd.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import my_project_bdd.driver.DriverManager;
import my_project_bdd.pages.RegisterPage;

public class RegisterSteps extends DriverManager {
    RegisterPage registerPage = new RegisterPage(driver);

    @When("I click 'Continua' button")
    public void clickContinue() {
        registerPage.clickContinueButton();    }

    @When("I fill email/phone input:(.*)$" )
    public void fillEmailPhone(String phoneEmail) {
        registerPage.fillEmailPhoneInput(phoneEmail);
    }

    @When("I click on 'Creeaza cont nou' button")
    public void clickCreeazaContNou(){
        registerPage.clickCreeazaContNou();
    }

        @Then("I Validate error msg: (.*)$")
    public void validateMsg(String expectedMsg){
        registerPage.validateErrorMessage(expectedMsg);

    }
    @Then("I validate register header is displayed")
    public void validateRegisterHeader(){
        registerPage.validateRegisterHeader();

    }


}
