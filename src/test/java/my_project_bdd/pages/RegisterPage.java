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

    @FindBy(xpath = "//input[@data-testid=\"input-field\"]")
    private WebElement emailPhoneInput;

    @FindBy(xpath = "//h2[@data-testid=\"create-account-title\"]")
    private WebElement registerHeader;

    @FindBy(xpath = "//div[contains(text(),'Creeaza un cont nou')]")
    private WebElement creeazaContNou;


    public void clickContinueButton() {
        continueButton.click();
    }

    public void fillEmailPhoneInput(String emailPhone) {
        emailPhoneInput.sendKeys(emailPhone);

    }

    public void clickCreeazaContNou(){
        creeazaContNou.click();
    }

    public void validateErrorMessage(String expectedMsg) {

        Assert.assertEquals("Validation msg is wrong", expectedMsg, validationErrorMsg.getText());
    }

    public void validateRegisterHeader() {

        Assert.assertEquals("Register header is wrong", "Creeaza un cont nou", registerHeader.getText());
    }


}
