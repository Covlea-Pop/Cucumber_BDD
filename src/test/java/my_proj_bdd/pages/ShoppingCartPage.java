package my_proj_bdd.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends BasePage {

    public ShoppingCartPage(WebDriver driver) {
        super(driver);
    }

    // Elemente
    @FindBy(xpath = "//div[@data-testid='basket-icon-to-remove-product']/parent::span/parent::button")
    private WebElement removeProductBtn;

    // Elemente
    @FindBy(xpath = "//div[@data-testid='text-container']/p/following-sibling::p")
    private WebElement emptyBasketMsg;

    // Actiuni
    public void clickRemoveProductBtn() {
        removeProductBtn.click();
    }

    // Validari
    public void validateEmptyBasketMsg() {
        Assert.assertEquals("Empty Basket Msg is incorrect", "Cosul tau este gol", emptyBasketMsg.getText());
    }
}
