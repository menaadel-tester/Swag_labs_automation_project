package checkoutitem;

import base.BaseTests;
import data.CheckOut;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

import java.io.FileNotFoundException;

import static reader.ReadDataFromJson.dataModel;

public class CheckOutItemTest extends BaseTests {



    @Test

    public void testCheckoutItems() throws FileNotFoundException {

        InventoryPage inventoryPage = homePage.loginUser(dataModel().Login.ValidCredintails.Username,dataModel().Login.ValidCredintails.Password);
        inventoryPage.clickonAddToCartButton();
       CartPage cartPage =  inventoryPage.clickOnCartButton();
        CheckOutPageOne checkOutPageOne = cartPage.clickCheckOutButton();
       CheckOutPageTwo checkOutPageTwo =  checkOutPageOne.clickOnContinueButton(dataModel().CheckOut.FirstName,dataModel().CheckOut.LastName,dataModel().CheckOut.ZipCode);
        CheckOutCompletePage checkOutCompletePage = checkOutPageTwo.clickOnFinishButton();

        Assert.assertEquals(checkOutCompletePage.getTextMessage(),"Thank you for your order!");








    }


}
