package my_proj_bdd.pages;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    // Elemente
    @FindBy(xpath = "//button[@data-testid='cookie-popup-accept']")
    private WebElement accecptCookiesButton;

    @FindBy(xpath = "//h2[@data-testid='cookie-popup-title']")
    private WebElement cookieHeader;

    @FindBy(xpath = "//button[@data-testid='header-myhub-toggle']")
    private WebElement contulMeuButton;

    @FindBy(xpath = "//button[@data-testid='product-block-add']")
    private List<WebElement> addToBasketButtonsAsList;

    @FindBy(xpath = "//a[@data-testid='header-minibasket']")
    private WebElement shoppingCartButton;

    @FindBy(xpath = "/html/body/div[4]/div/div[1]/header/div/div[2]/button/span")
    private WebElement alegeMaiTarziuBtn;

    // Actiuni
    public void clickAcceptCookiesButton() {
        accecptCookiesButton.click();
    }

    public void openHomePage() {
        driver.get("https://www.mega-image.ro/");
    }

    public void clickContulMeuButton() {
        contulMeuButton.click();
    }

    public void clickShoppingCartButton() {
        shoppingCartButton.click();
    }

    public void clickAddToBasketButtonByIndex(String index) {
        // transformam index din string in int
        int index_as_int = Integer.valueOf(index);
        // gasim elementul
        WebElement elem = addToBasketButtonsAsList.get(index_as_int);
        // mai facem un mic scroll in jos
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("window.scrollBy(0,700)", "");
        // dam click pe button
        executor.executeScript("arguments[0].click();", elem);
        // asteptam o secunda sa se adauge produsul in cod
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void clickAlegeMaiTarziuButton() {
        try {
            // incearca sa dai click daca gasesti acest element
            alegeMaiTarziuBtn.click();
        } catch (NoSuchSessionException e) {
            // testul trece mai departe si daca nu am gasit acel element
        }
    }

    // Validari
    public void validateCookieHeader() {
        // mesaj in caz ca pica validarea, la ce ma astept, ce am gasit pe site
        Assert.assertEquals("Cookie Header title is incorrect", "Cookie-uri pe mega-image.ro", cookieHeader.getText());
    }
}
