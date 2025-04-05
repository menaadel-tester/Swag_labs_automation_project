package selectvaluefromlist;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.InventoryPage;

import java.io.FileNotFoundException;

import static reader.ReadDataFromJson.dataModel;

public class SelectValueTest extends BaseTests {

    @Test

    public void testSelectValueFromList() throws FileNotFoundException {

        InventoryPage inventoryPage = homePage.loginUser(dataModel().Login.ValidCredintails.Username,dataModel().Login.ValidCredintails.Password);
        inventoryPage.selectItemByText("Price (high to low)");





    }
}