package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utils.Utility;

public class HomePage extends WebTestBase {
    @FindBy(xpath="//input[@class='input_location font14 fw400 color111']")
    WebElement location;

    @FindBy(xpath="//input[@class='input_search font14 fw400 color111']")
    WebElement element;

    @FindBy(xpath="//div[@class='jdicon search_white_icon']")
    WebElement search;

    @FindBy(xpath="//h1[text()='Hotels in Mumbai']")
    WebElement aftersearch;

    @FindBy(xpath="//div[@class='jsx-fd80d215b389daad modal_white_close jdicon']")
    WebElement addclosed;


    public HomePage() {

        PageFactory.initElements(driver, this);
    }
    public void search(String cityname,String productname){
        location.sendKeys(cityname);
        element.sendKeys(productname);
        search.click();
    }
    public void closeAd(){
        Utility.waitUntilElementClickable(driver,addclosed);
        addclosed.click();
    }
    public String getNextPage(){
        return aftersearch.getText();
    }
}
