package clickonsocialMediabuttons;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.InventoryPage;

import java.io.FileNotFoundException;

import static reader.ReadDataFromJson.dataModel;

public class LinkedInTest extends BaseTests {

    @Test

    public void testLinkedinURL() throws FileNotFoundException {

        InventoryPage inventoryPage = homePage.loginUser(dataModel().Login.ValidCredintails.Username,dataModel().Login.ValidCredintails.Password);
        inventoryPage.verifyLinkedInPage();
        String expectedURL = "https://www.linkedin.com/company/sauce-labs/";

        Assert.assertEquals(inventoryPage.getCurrentURL(),expectedURL);
    }
}
