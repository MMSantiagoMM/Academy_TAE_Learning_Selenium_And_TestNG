package tests;

import data.DataProviderTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PurchaseTest extends BaseTest{

    @Test(dataProvider = "PurchaseDataProvider",dataProviderClass = DataProviderTest.class)
    public void purchaseTest(String name, String lastName, String postalCode, String textValidate){
        getPurchasePage();
        purchasePage.clickSelectedElement();
        purchasePage.addElementToCart();
        purchasePage.goToCard();
        purchasePage.clickCheckout();
        purchasePage.setFirstName(name);
        purchasePage.setLastName(lastName);
        purchasePage.setPostalCode(postalCode);
        purchasePage.clickContinue();
        purchasePage.clickFinish();
        Assert.assertEquals(purchasePage.checkLastPage(),textValidate);
        purchasePage.clickGoHome();

    }


}
