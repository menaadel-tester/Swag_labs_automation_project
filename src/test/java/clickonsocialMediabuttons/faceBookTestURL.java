package clickonsocialMediabuttons;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.InventoryPage;

import java.io.FileNotFoundException;

import static reader.ReadDataFromJson.dataModel;

public class faceBookTestURL extends BaseTests {


    @Test

    public void testFaceBookURL() throws FileNotFoundException {


        InventoryPage inventoryPage = homePage.loginUser(dataModel().Login.ValidCredintails.Username,dataModel().Login.ValidCredintails.Password);
        inventoryPage.verifyFaceBookTab();
        String expectedURL = "https://www.facebook.com/saucelabs";
        Assert.assertEquals(inventoryPage.getCurrentURL(),expectedURL);

    }
}
