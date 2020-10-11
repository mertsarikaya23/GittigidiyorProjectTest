package TESTMETHODS;

import com.testinium.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static EQUPMENTS.ConstantsPage.*;

public class TestPage extends BasePage
{


    public void userRegistration()
    {
        clickElement(By.cssSelector(BUTTONMOVE));
        clickElement(By.cssSelector(DOUSER));

        sendKeys(By.cssSelector(USERNAMEINPUT),"Mert");
        sendKeys(By.cssSelector(SURNAMEINPUT),"SARIKAYA");
        sendKeys(By.cssSelector(EMAİLINPUT),"E-MAİL HERE");
        sendKeys(By.cssSelector(PASSWORDINPUT),"123123123");
        sendKeys(By.cssSelector(GSMNUMBER),"5333333333");


    }
    public void login()
    {
        clickElement(By.cssSelector(LOGINLABE));
        sendKeys(By.cssSelector(USERNAME),"E-MAİL HERE");
        sendKeys(By.cssSelector(PASSWORD),"PASWORD-HERE");
        clickElement(By.cssSelector(LOGINBTN));

    }
    public void searchProduct()
    {
        sendKeys(By.cssSelector(SEARCHAREA),"Bisiklet");
        clickElement(By.cssSelector(SEARCHBUTTON));
    }

    public void addBasket()
    {
        clickElement(By.cssSelector(PRODUCT));
        clickElement(By.linkText(COLOUR));
        clickElement(By.cssSelector(ADDBUTTON));
        clickElement(By.cssSelector(MyBASKET));
    }

    public void assertMethod()
    {
        Assert.assertEquals(PRODUCT,BASKETPRODUCT);
        System.out.println("Sepetinizdeki ürün ile seçtiğiniz ürün eşleşiyor.");

    }

    public void addAdress()
    {
        clickElement(By.cssSelector(MyACCOUNT));
        clickElement(By.cssSelector(MyDATA));
        clickElement(By.cssSelector(MyADRESS));
        clickElement(By.cssSelector(NEWADRESS));
        sendKeys(By.cssSelector(TITLE),"Aile Evi");
        sendKeys(By.cssSelector(NAME),"Mert");
        sendKeys(By.cssSelector(SURNAME),"Sarıkaya");

        clickElement(By.cssSelector(CLICKCITY));
        clickElement(By.cssSelector(CITY));
        clickElement(By.cssSelector(CLICKDISTRITC));
        clickElement(By.cssSelector(DISTRITC));
        clickElement(By.cssSelector(CLICKNEIGHBORHOOD));
        clickElement(By.cssSelector(NEIGHBORHOOD));

        sendKeys(By.cssSelector(POSTAKOD),"34664");
        sendKeys(By.cssSelector(ADRESSAREA),"xxxmah,xxxsk,xxxapt,xxxno");
        sendKeys(By.cssSelector(TELNO),"5333333333");



    }

}
