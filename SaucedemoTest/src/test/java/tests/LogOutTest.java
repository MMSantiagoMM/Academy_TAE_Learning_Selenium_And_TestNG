package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LogOutTest extends BaseTest{

    @Test
    public void testLogOut(){
        getLogOutPage();
        logOutPage.clickMenu();
        logOutPage.clickLogOut();
        Assert.assertTrue(logOutPage.isInLogInPage());
    }
}
