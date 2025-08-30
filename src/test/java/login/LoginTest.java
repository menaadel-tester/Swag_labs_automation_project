package login;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.InventoryPage;

import java.io.FileNotFoundException;

import static reader.ReadDataFromJson.dataModel;

public class LoginTest extends BaseTests {

    @Test

    public void testValidLogin() throws FileNotFoundException {

     InventoryPage inventoryPage =  homePage.loginUser(dataModel().Login.ValidCredintails.Username,dataModel().Login.ValidCredintails.Password);

    Assert.assertTrue(inventoryPage.productsIsDisplayed());

    }

    @Test

    public void testLoginwithInvalidUserName() throws FileNotFoundException {

        InventoryPage inventoryPage = homePage.loginUser(dataModel().Login.InvalidCredintails.InvalidUsername.Username,dataModel().Login.InvalidCredintails.InvalidUsername.Password);

        Assert.assertTrue(homePage.messageIsDisplayed());

        Assert.assertEquals(homePage.getErrorMessage(),"Epic sadface: Username and password do not match any user in this service");

    }


}
