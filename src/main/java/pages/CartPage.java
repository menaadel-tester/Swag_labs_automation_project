package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class CartPage extends MethodHandles {


    public CartPage(WebDriver driver){

        super(driver);

    }

    //Locators

    private final By checkoutButton = By.id("checkout");
    private final By yourCartText = By.xpath("//span[text()='Your Cart']");

    private final By removeButton = By.xpath("//button[text()='Remove']");

    private final By continueButton = By.xpath("//button[text()='Continue Shopping']");;



    public CheckOutPageOne clickCheckOutButton(){


        click(checkoutButton,10);

        return new CheckOutPageOne(driver);

    }

    public void clickOnRemoveButton(){

        click(removeButton,10);
    }

    public boolean yourCartTextDisplayed(){

        return isDisplayed(yourCartText,10);
    }

    public boolean continueButtonIsDisplayed(){

        return isDisplayed(continueButton,10);
    }



}





