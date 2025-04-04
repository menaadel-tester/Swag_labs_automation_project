package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class HomePage extends MethodHandles {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    //locators

    private final By usernameField = By.id("user-name");
    private final By passwordField = By.id("password");
    private final By loginButton = By.id("login-button");

    private final By actualResult = By.xpath("//h3[@data-test='error']");

    private final By swagLog = By.xpath("//div[text()='Swag Labs']");

    //Actions

    public InventoryPage loginUser(String username , String password){

        sendKeys(usernameField,username,10);
        sendKeys(passwordField,password,10);
        click(loginButton,10);
        return new InventoryPage(driver);

    }

    public boolean messageIsDisplayed(){

        return isDisplayed(actualResult,10);

    }

    public String  getErrorMessage(){

     return getText(actualResult,10);
    }

    public boolean logoDisplaying(){

        return isDisplayed(swagLog,10);

    }




}
