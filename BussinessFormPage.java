package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utils.Utility;

public class BussinessFormPage extends WebTestBase {
    @FindBy(xpath="//a[@class='color111']")
    WebElement elementclick;

   @FindBy(id="fcom")
   WebElement entername;

    @FindBy(id="flcity")
    WebElement entercity;

    @FindBy(xpath="//button[@class='bbtn subbtn']")
    WebElement clcikbtn;

    @FindBy(xpath="//div[@class='jsx-fd80d215b389daad modal_white_close jdicon']")
    WebElement addclosed;

    public BussinessFormPage() {
        PageFactory.initElements(driver, this);
    }
    public void alertMethod(String companyname)throws InterruptedException{
        Utility.ScrollDown(driver);
        elementclick.click();
        entername.sendKeys(companyname);
       // entercity.sendKeys(city);
        clcikbtn.click();
        Utility.alertmethod(driver);
    }
    public void closeAd(){
        Utility.waitUntilElementClickable(driver,addclosed);
        addclosed.click();
    }




}
