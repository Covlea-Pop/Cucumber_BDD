package my_project_bdd.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import my_project_bdd.driver.DriverManager;
import my_project_bdd.pages.HomePage;

public class HomeSteps extends DriverManager {

    HomePage homePage = new HomePage(driver);

    @Given("I am a user on Mega Image home page")
    public void openHomePage(){
        homePage.openHomePage();
    }
    @Then("I validate cookie header and click accept cookie button")
    public void acceptCookies(){
        homePage.validateCookieHeader();
        homePage.clickAcceptCookiesButton();
    }
    @When("I click 'Contul Meu' button")
    public void clickContulMeu(){

        homePage.clickContulMeuButton();
    }
}
