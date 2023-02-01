package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utils.ActionClass;
import utils.Utility;

public class MouseHoverPage extends WebTestBase {

    @FindBy(xpath="//div[text()='PG/Hostels']")
    WebElement clickon;

    @FindBy(xpath="//div[text()='Popular Categories']")
    WebElement mousehover;

    @FindBy(xpath="//div[text()='Computer Training Institutes']")
    WebElement findelement;

    @FindBy(xpath="//div[@class='jsx-fd80d215b389daad modal_white_close jdicon']")
    WebElement addclosed;



    public MouseHoverPage(){
        PageFactory.initElements(driver, this);
    }

    public void mouseHover(){
        clickon.click();
        ActionClass.moveToElement(driver,mousehover);
    }
   public void closeAd(){
        Utility.waitUntilElementClickable(driver,addclosed);
        addclosed.click();
    }
    public String getfindElement(){
       return findelement.getText();
    }


}
