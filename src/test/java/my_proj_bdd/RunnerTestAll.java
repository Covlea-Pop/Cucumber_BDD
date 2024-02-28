package my_proj_bdd;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/tests/homePage.feature",
                    "src/test/resources/tests/register.feature",
                    "src/test/resources/tests/shoppingCart.feature",
                    "src/test/resources/tests/recipes.feature"},
        plugin = {"pretty", "json:target/report.json", "html:target/cucumber-reports"}
)
public class RunnerTestAll {
}
