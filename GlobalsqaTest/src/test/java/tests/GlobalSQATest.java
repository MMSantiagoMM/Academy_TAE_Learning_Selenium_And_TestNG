package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class GlobalSQATest extends BaseTest{


    @Test
    public void testGlobalSQA(){
        getGlobalSQAPage();
        globalSQAPage.clickClickHere();
        globalSQAPage.clickOpenNewTab();
        globalSQAPage.switchToNewTabAndClick();

        assertEquals(globalSQAPage.checkManualTestingOption(),"Manual Testing Training");

        globalSQAPage.clickAlterBox();
        globalSQAPage.switchToInitialTab();

        assertEquals(globalSQAPage.confirmAnnounceAfterCancel(),"You Pressed Cancel");




    }
}
