package my_project_bdd.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {
    public RegisterPage(WebDriver driver) {
        super((driver));

    }

    @FindBy(xpath = "//button[@data-testid=\"submit-button\"]")
    private WebElement continueButton;

    @FindBy(xpath = "//p[@data-testid=\"form-error-message\"]")
    private WebElement validationErrorMsg;


    public void clickContinueButton(){
        continueButton.click();
    }

    public void validateErrorMessage (String expectedMsg){

        Assert.assertEquals("Validation msg is wrong",expectedMsg,validationErrorMsg.getText());
    }



}
