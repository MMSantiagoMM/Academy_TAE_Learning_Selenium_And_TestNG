package tests;

import org.testng.annotations.Test;

public class AboutUsTest extends BaseTest{


    @Test
    public void aboutUsTest(){
        getAboutUsPage();
        aboutUsPage.pressAboutUs();
        aboutUsPage.pressPlay();
    }


}
