package addtocart;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.InventoryPage;

import java.io.FileNotFoundException;

import static reader.ReadDataFromJson.dataModel;

public class AddtoCartTest extends BaseTests {


    @Test

    public void testAddItemtoCart() throws FileNotFoundException {

     InventoryPage inventoryPage = homePage.loginUser(dataModel().Login.ValidCredintails.Username,dataModel().Login.ValidCredintails.Password);
     inventoryPage.clickonAddToCartButton();

     Assert.assertTrue(inventoryPage.removeButtonIsDisplayed());

    }

    @Test

    public void testClickOnCartButton() throws FileNotFoundException {

        InventoryPage inventoryPage = homePage.loginUser(dataModel().Login.ValidCredintails.Username,dataModel().Login.ValidCredintails.Password);
        inventoryPage.clickonAddToCartButton();
        CartPage cartPage = inventoryPage.clickOnCartButton();
        Assert.assertTrue(cartPage.yourCartTextDisplayed());

    }

    @Test

    public void testRemoveItemFromCart() throws FileNotFoundException {

        InventoryPage inventoryPage = homePage.loginUser(dataModel().Login.ValidCredintails.Username,dataModel().Login.ValidCredintails.Password);
        inventoryPage.clickonAddToCartButton();
        CartPage cartPage = inventoryPage.clickOnCartButton();
        cartPage.clickOnRemoveButton();
        Assert.assertTrue(cartPage.continueButtonIsDisplayed());
    }



}
