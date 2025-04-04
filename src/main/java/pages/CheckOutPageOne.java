package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class CheckOutPageOne extends MethodHandles {



    public CheckOutPageOne(WebDriver driver){


        super(driver);


    }

    //Locators

    private final By firstNameField =By.id("first-name");
    private final By lastNameField = By.id("last-name");
    private final By zipCodeField = By.id("postal-code");
    private final By continueBtn = By.xpath("//input[@type='submit']");

    // Actions

    private void insertFirstName(String firstname){

        sendKeys(firstNameField,firstname,10);
    }

    private void insertLastName(String lastname){

        sendKeys(lastNameField,lastname,10);
    }

    private void insertZipCode(String zipcode){

        sendKeys(zipCodeField,zipcode,10);
    }

    public CheckOutPageTwo clickOnContinueButton(String fname,String lname,String zcode){

        insertFirstName(fname);
        insertLastName(lname);
        insertZipCode(zcode);
        click(continueBtn,10);

        return new CheckOutPageTwo(driver);

    }








}
