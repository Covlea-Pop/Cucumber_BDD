package my_project_bdd.pages;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super((driver));
    }

    @FindBy(xpath = "//button[@data-testid='cookie-popup-accept']")
    private WebElement acceptCookiesButton;

    @FindBy(xpath = "//h2[@data-testid='cookie-popup-title']")
    private WebElement cookieHeader;

    @FindBy(xpath = "//*[@id=\"app-root\"]/header/div/div[2]/div/div[3]/div[3]/div/button/span/div/div")
    private WebElement contulMeuButton;

    @FindBy(xpath = "//button[@data-testid=\"product-block-add\"]")
    private List<WebElement> addToBasketButtonsAsList;

    @FindBy(xpath = "//a[@data-testid=\"header-minibasket\"]")
    private WebElement shoppingCartButton;


    public void clickAcceptCookiesButton() {
        acceptCookiesButton.click();
    }

    public void clickShoppingCartButton() {
        shoppingCartButton.click();
    }

    public void clickAddToBasketButtonByIndex(String index) {

        int index_as_int = Integer.valueOf(index);
        WebElement elm = addToBasketButtonsAsList.get(index_as_int);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("window.scrollBy(0,700)" , "");
    }

    public void openHomePage() {
        driver.get("https://www.mega-image.ro/");
    }

    public void clickContulMeuButton() {
        contulMeuButton.click();
    }

    public void validateCookieHeader() {
        Assert.assertEquals("Cookie-uri pe mega-image.ro", cookieHeader.getText());
    }
}
