package logout;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.InventoryPage;

import java.io.FileNotFoundException;

import static reader.ReadDataFromJson.dataModel;

public class LogOutTest extends BaseTests {

    @Test(priority = 2)

    public void testLogout() throws FileNotFoundException {

        InventoryPage inventoryPage =  homePage.loginUser(dataModel().Login.ValidCredintails.Username,dataModel().Login.ValidCredintails.Password);
        inventoryPage.logoutFromInventoryScreen();

        Assert.assertTrue(homePage.logoDisplaying());
    }

}
