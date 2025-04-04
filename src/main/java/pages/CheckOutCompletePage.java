package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class CheckOutCompletePage extends MethodHandles {


    public CheckOutCompletePage(WebDriver driver){

        super(driver);



    }

    //locators

    private final By actualResult = By.xpath("//h2[text()='Thank you for your order!']");


    public String getTextMessage(){

        return getText(actualResult,10);
    }



}
