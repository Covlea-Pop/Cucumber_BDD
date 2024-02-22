package my_proj_bdd.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    // Elemente
    @FindBy(xpath = "//button[@data-testid='submit-button']")
    private WebElement continueButton;

    @FindBy(xpath = "//p[@data-testid='form-error-message']")
    private WebElement validationErrorMsg;

    @FindBy(xpath = "//input[@data-testid='input-field']")
    private WebElement emailPhoneInput;

    @FindBy(xpath = "//*[@id=\"app-root\"]/div[2]/div/div[4]/div/div/div/button[2]/div/div")
    private WebElement registerHeader;

    // Actiuni
    public void clickContinueButton() {
        continueButton.click();
    }

    public void fillEmailPhoneInput(String emailPhone) {
        emailPhoneInput.sendKeys(emailPhone);
    }

    // Validari
    public void validateErrorMessage(String expectedMsg) {
        Assert.assertEquals("Validation msg is wrong", expectedMsg, validationErrorMsg.getText());
    }

    public void validateRegisterHeader() {
        Assert.assertEquals("Register header is wrong", "Creeaza un cont nou", registerHeader.getText());
    }
}
