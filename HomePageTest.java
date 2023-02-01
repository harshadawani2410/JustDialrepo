import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.*;
import testbase.WebTestBase;

public class HomePageTest extends WebTestBase {

    HomePage homepage;
    MouseHoverPage mousehoverpage;
    MoviesPage drpdwnpage;
    FacebookPage facebookpage;
    BussinessFormPage bussinesspage;
    AxixBankPage axixbankpage;

    public HomePageTest(){
        super();
    }
    @BeforeMethod
    public void beforeMethod(){
        initialization();
        homepage=new HomePage();
        mousehoverpage=new MouseHoverPage();
        drpdwnpage=new MoviesPage();
        facebookpage=new FacebookPage();
        bussinesspage=new BussinessFormPage();
        axixbankpage =new AxixBankPage();
       }
    @Test
    public void verifyMouseHoverFunction(){
        SoftAssert softassert=new SoftAssert();
        mousehoverpage.closeAd();
        mousehoverpage.mouseHover();
        softassert.assertAll();
    }
    @Test
    public void verifySearchingFunctinality(){

        SoftAssert softassert=new SoftAssert();
        homepage.closeAd();
        homepage.search(prop.getProperty("cityname"),prop.getProperty("productname"));
        softassert.assertEquals(homepage.getNextPage(),"Hotels in Mumbai","Hotels in Mumbai text should be match");
        softassert.assertAll();
    }
    @Test
    public void verifyDropDownFunction()throws InterruptedException{
        SoftAssert softassert=new SoftAssert();
        drpdwnpage.closeAd();
        drpdwnpage.clickElement("Marathi");
        softassert.assertEquals(drpdwnpage.getNextPage(),"Marathi","Marathi  text should be match");
        softassert.assertAll();
    }
    @Test
    public void verifyWindowHandlesFunction()throws InterruptedException{
        facebookpage.closeAd();
        facebookpage.windowHandleMethod();
    }

    @Test
    public void verifyAlertHandleFunction() throws InterruptedException{
        bussinesspage.closeAd();
        bussinesspage.alertMethod(prop.getProperty("companyname"));
    }
    @Test
    public void verifyCookiesMethods(){
        axixbankpage.getcookiesMethod();
        axixbankpage.addcookiesMethod("Facebook","Here is Customize Cookie...");
    }
    @Test
    public void verifySelectInCheckBoxFunction(){
        axixbankpage.closeAd();
        axixbankpage.isDisplayed();
        axixbankpage.isEnable();
        axixbankpage.isSelectMethod();
    }
    @Test
    public void veryfyIFrame()throws InterruptedException{
        axixbankpage.iFrame();
    }
    @AfterMethod
    public void afterMethod(){
        driver.close();
    }
}
