package tests;


import org.testng.annotations.Test;

public class LogInTest extends BaseTest {

    @Test
    public void testLogIn(){

        getLogInPage();
        logInPage.pressLogInLink();
        logInPage.fillUserName();
        logInPage.fillPassword();
        logInPage.pressLogInButton();

    }
}
