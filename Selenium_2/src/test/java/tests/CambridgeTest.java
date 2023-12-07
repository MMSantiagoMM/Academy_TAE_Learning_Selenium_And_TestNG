package tests;

import org.testng.annotations.Test;

public class CambridgeTest extends BaseTest{

    @Test
    public void  testCambridge(){
        getHomePage();
        homePage.setWord();
        homePage.pressButton();
        homePage.playAudio();

    }




}
