package data;


import org.testng.annotations.DataProvider;

public class DataProviderTest {


    @DataProvider(name = "LoginDataProvider")
    public Object[][] getDataLogIn(){
        return new Object[][]{{"standard_user","secret_sauce"} };
    }

    @DataProvider(name = "PurchaseDataProvider")
    public Object[][] getDataPurchase(){
        return new Object[][]{{"Fiodor","Dostoevsky","1234556","Thank you for your order!"} };
    }




}
