package my_proj_bdd.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RecipesPage extends BasePage {

    public RecipesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[contains(text(),'Salate')]")
    private WebElement salateButton;

    @FindBy(xpath = "//a[contains(text(),'Aperitive')]")
    private WebElement aperitiveButton;

    @FindBy(xpath = "//a[contains(text(),'Supe')]")
    private WebElement supeButton;

    @FindBy(xpath = "//a[contains(text(),'Deserturi')]")
    private WebElement deserturiButton;


    @FindBy(xpath = "//a[contains(text(),'Tarte/Placinte')]")
    private WebElement tartePlacinteButton;

    @FindBy(xpath = "//a[contains(text(),'Toate retetele')]")
    private WebElement toateReteteleButton;

    public void clickSalateButton() {

        salateButton.click();
        driver.navigate().back();
    }
    public void clickAperitiveButton() {

        aperitiveButton.click();
        driver.navigate().back();
    }
    public void clickSupeButton() {

        supeButton.click();
        driver.navigate().back();
    }
    public void clickDeserturiButton() {

        deserturiButton.click();
        driver.navigate().back();
    }
    public void clickTartePlacinteButton() {

        tartePlacinteButton.click();
        driver.navigate().back();
    }
    public void clickToateReteteleButton() {

        toateReteteleButton.click();
        driver.navigate().back();
    }


}