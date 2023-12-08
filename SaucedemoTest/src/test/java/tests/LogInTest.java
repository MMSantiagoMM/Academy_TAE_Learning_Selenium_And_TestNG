package tests;

import data.DataProviderTest;
import org.testng.annotations.Test;

public class LogInTest extends BaseTest{



    @Test(dataProvider = "LoginDataProvider",dataProviderClass = DataProviderTest.class)
    public void testLogIn(String userName, String password){
        getLogInPage();
        logInPage.setUserName(userName);
        logInPage.setPassword(password);
        logInPage.clickButton();

    }



}
