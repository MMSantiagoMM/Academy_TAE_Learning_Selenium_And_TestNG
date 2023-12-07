package tests;

import org.testng.annotations.Test;

public class SignUpTest extends BaseTest {


    @Test
    public void testSignUp(){
        getSignUpPage();
        signUpPage.pressSignUp();
        signUpPage.enterUserName();
        signUpPage.enterPassword();
        signUpPage.pressSignUpButton();
    }
}
