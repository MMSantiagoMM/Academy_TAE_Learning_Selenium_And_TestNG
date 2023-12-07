package tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.testng.annotations.Test;

public class LaptopTest extends BaseTest{



    @Test
    public void testLaptopTest(){

        getLaptopPage();

        laptopPage.pressLaptopCategory();
        laptopPage.selectLaptop();
        laptopPage.pressAddToCard();
        laptopPage.selectCard();
        try{
            Alert alt = driver.switchTo().alert();
            System.out.println(alt.getText());
            alt.accept();

        }catch (NoAlertPresentException e){
            System.out.println(e.getMessage());
        }


        laptopPage.pressBuy();
        laptopPage.fillName();
        laptopPage.fillCountry();
        laptopPage.fillCity();
        laptopPage.fillCard();
        laptopPage.fillMonth();
        laptopPage.fillYear();
        laptopPage.pressPurchaseButton();



    }


}
