package tests;

import org.testng.annotations.Test;

public class AboutUsTest extends BaseTest{

    @Test
    public void testHomePage(){

        getAboutUsPage();
        aboutUsPage.clickAboutUs();
        aboutUsPage.playVideo();
    }


}
