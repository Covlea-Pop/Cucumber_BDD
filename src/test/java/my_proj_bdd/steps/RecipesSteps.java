package my_proj_bdd.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import my_proj_bdd.driver.DriverManager;
import my_proj_bdd.pages.RecipesPage;
import my_proj_bdd.pages.RegisterPage;

public class RecipesSteps extends DriverManager {

    RecipesPage recipesPage = new RecipesPage(driver);

    @When("I click 'Salate' button")
    public void clickSalateButton() {
        recipesPage.clickSalateButton();
    }

    @When("I click 'Aperitive' button")
    public void clickAperitiveButton() {
        recipesPage.clickAperitiveButton();
    }

    @When("I click 'Supe' button")
    public void clickSupeButton() {
        recipesPage.clickSupeButton();
    }

    @When("I click 'Deserturi' button")
    public void clickDeserturiButton() {
        recipesPage.clickDeserturiButton();
    }

    @When("I click 'TartePlacinte' button")
    public void clickTartePlacinteButton() {
        recipesPage.clickTartePlacinteButton();
    }


    @When("I click 'ToateRetetele' button")
    public void clickToateRetetele() {
        recipesPage.clickToateReteteleButton();
    }

}