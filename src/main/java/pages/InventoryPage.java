package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class InventoryPage extends MethodHandles {


    public InventoryPage(WebDriver driver) {

        super(driver);
    }

    //Locators

    private final By products = By.xpath("//span[text()='Products']");
    private final By menuSideButton = By.id("react-burger-menu-btn");
    private final By logoutLink = By.xpath("//a[text()='Logout']");

    private final By addtoCartButton = By.xpath("(//button[text()='Add to cart'])[1]");

    private final By cartButton = By.xpath("//a[@data-test='shopping-cart-link']");

    private final By removeButton = By.xpath("//button[text()='Remove']");

    private final By facebookButton = By.xpath("//a[text()='Facebook']");

    private final By linkedInButton = By.xpath("//a[text()='LinkedIn']");



    public boolean productsIsDisplayed() {

        return isDisplayed(products, 10);
    }

    private void clickOnMenuSideButton() {

        click(menuSideButton, 10);
    }

    private void clickOnLogOutLink() {

        click(logoutLink, 10);
    }

    public HomePage logoutFromInventoryScreen() {

        clickOnMenuSideButton();
        clickOnLogOutLink();

        return new HomePage(driver);


    }

    public void clickonAddToCartButton(){

        click(addtoCartButton,10);

    }

    public CartPage clickOnCartButton(){

        clickonAddToCartButton();
        click(cartButton,10);
        return new CartPage(driver);

    }

    public boolean removeButtonIsDisplayed(){

        return isDisplayed(removeButton,10);

    }

    public void clickOnFacebookButton(){

        click(facebookButton,10);
    }

    // this Feature is used in case the System Open the other tab when click on button & Open new tab it is not original tab

    public void verifyFaceBookTab(){

        clickOnFacebookButton();
        String originalWindow = getWindowHandle();

        for(String windowHandle: driver.getWindowHandles()){

            if(!windowHandle.equals(originalWindow)){

                driver.switchTo().window(windowHandle);
                break;
            }
        }

    }

    public void verifyLinkedInPage(){

        click(linkedInButton,10);

        String originalWindow = driver.getWindowHandle();
        for(String windowHandle: driver.getWindowHandles()){

            if(!windowHandle.equals(originalWindow)){

                driver.switchTo().window(windowHandle);
            }
        }
    }

    public String getCurrentURL(){

        return driver.getCurrentUrl();

    }

}




