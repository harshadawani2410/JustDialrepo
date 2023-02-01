package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utils.Utility;

import java.util.List;

public class MoviesPage extends WebTestBase {
    @FindBy(xpath="//a[text()='Entertainment']")
    WebElement elementclick;

    @FindBy(xpath="//div[@class='movies_lang dropdown flt-scs']")
    WebElement btnclick;

   @FindBy(xpath="//ul[@class='dropdown-menu mCustomScrollbar _mCS_2']//div/li/a")
    List<WebElement> dropdown;

   @FindBy(id="15365485")
   WebElement afterselect;

    @FindBy(xpath="//div[@class='jsx-fd80d215b389daad modal_white_close jdicon']")
    WebElement addclosed;


    public MoviesPage() {
        PageFactory.initElements(driver, this);
    }
    public void clickElement(String value)throws InterruptedException{
        Utility.ScrollDown(driver);
        elementclick.click();
        btnclick.click();
        Utility.selectValue(dropdown,value);
    }
    public void closeAd(){
        Utility.waitUntilElementClickable(driver,addclosed);
        addclosed.click();
    }
    public String getNextPage(){
        return afterselect.getText();
    }
}
