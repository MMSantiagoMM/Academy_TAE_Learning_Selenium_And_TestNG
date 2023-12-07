package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LaptopPage extends BasePage{

    public LaptopPage(WebDriver driver,String url) {
        super(driver);
        this.driver.get(url);
    }

    @FindBy(css = "a[onclick=\"byCat('notebook')\"]")
    private WebElement laptopCategory;

    @FindBy(css = "a[href='prod.html?idp_=8'][class='hrefch']")
    private WebElement laptopSelected;

    @FindBy(css = "a[onclick='addToCart(8)']")
    private WebElement addToCard;

    @FindBy(id = "cartur")
    private WebElement cart;

    @FindBy(css = "button[data-target='#orderModal']")
    private WebElement buyButton;

    @FindBy(id = "name")
    private WebElement name;

    @FindBy(id = "country")
    private WebElement country;

    @FindBy(id = "city")
    private WebElement city;

    @FindBy(id = "card")
    private WebElement card;

    @FindBy(id = "month")
    private WebElement month;

    @FindBy(id = "year")
    private WebElement year;

    @FindBy(css = "button[onclick='purchaseOrder()']")
    private WebElement purchaseButton;


    public void pressLaptopCategory(){
        this.isElementDelayed(laptopCategory);
        laptopCategory.click();
    }

    public void selectLaptop(){
        this.isElementDelayed(laptopSelected);
        laptopSelected.click();
    }

    public void pressAddToCard(){
        this.isElementDelayed(addToCard);
        addToCard.click();
    }

    public void selectCard(){
        this.isElementDelayed(cart);
        cart.click();
    }

    public void pressBuy(){
        this.isElementDelayed(buyButton);
        buyButton.click();
    }

    public void fillName(){
        this.isElementDelayed(name);
        name.sendKeys("testName");
    }

    public void fillCountry(){
        this.isElementDelayed(country);
        country.sendKeys("testCountry");
    }

    public void fillCity(){
        this.isElementDelayed(city);
        city.sendKeys("testCity");
    }

    public void fillCard(){
        this.isElementDelayed(card);
        card.sendKeys("testCard");
    }

    public void fillMonth(){
        this.isElementDelayed(month);
        month.sendKeys("testMonth");
    }

    public void fillYear(){
        this.isElementDelayed(year);
        year.sendKeys("testYear");
    }

    public void pressPurchaseButton(){
        this.isElementDelayed(purchaseButton);
        purchaseButton.click();
    }



}
