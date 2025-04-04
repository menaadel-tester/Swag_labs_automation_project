package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class CheckOutPageTwo extends MethodHandles {


    public CheckOutPageTwo(WebDriver driver){

        super(driver);
    }


    //Locators

    private final By finishButton = By.id("finish");
    private final By checkoutReview = By.xpath("//span[text()='Checkout: Overview']");

    //Actions

    public CheckOutCompletePage clickOnFinishButton(){

        click(finishButton,10);
        return new CheckOutCompletePage(driver);


    }

}
