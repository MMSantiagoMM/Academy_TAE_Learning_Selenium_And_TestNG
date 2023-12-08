package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasePage;

public class RemovingTest extends BaseTest {

    @Test
    public void testRemoving(){
        getRemovingPage();
        removingPage.setPack();
        removingPage.setTShirt();
        removingPage.setTsRed();
        removingPage.goToCart();
        removingPage.deletePack();
        removingPage.deleteTShirt();
        removingPage.deleteTSRed();
        Assert.assertEquals(removingPage.getCartEmpty(),"");

    }

}
