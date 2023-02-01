package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utils.Utility;

import java.util.Set;

public class FacebookPage extends WebTestBase {
    @FindBy(xpath="//a[@class='jsx-ac15877760567ebb flw_facebook ml-20']")
    WebElement facebook;

    @FindBy(xpath="//div[@class='jsx-fd80d215b389daad modal_white_close jdicon']")
    WebElement addclosed;

    public FacebookPage() {

        PageFactory.initElements(driver, this);
    }
    public void windowHandleMethod()throws InterruptedException{
        Utility.ScrollDown(driver);
        facebook.click();
        Utility.getwindowHandle(driver);

    }
    public void closeAd(){
        Utility.waitUntilElementClickable(driver,addclosed);
        addclosed.click();
    }


}
