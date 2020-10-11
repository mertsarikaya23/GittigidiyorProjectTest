package com.testinium;

import EQUPMENTS.ConstantsPage;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import static EQUPMENTS.ConstantsPage.*;

import java.net.URL;

public class BasePage
{

    public WebDriver driver;
    public WebDriverWait driverWait;

    @Before
    public void setUp()
    {

        System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(URL);
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();
        driverWait=new WebDriverWait(driver,3000);

    }


    public void untilElementPresence(By Locater)
    {
        driverWait.until(ExpectedConditions.presenceOfElementLocated(Locater));
    }

    public void untilElementDisplayed(By Locater)
    {
        driverWait.until(ExpectedConditions.visibilityOfElementLocated(Locater));
    }

    public void untilElementClickable(By Locater)
    {
        driverWait.until(ExpectedConditions.elementToBeClickable(Locater));
    }

    public WebElement findElement(By Locater)
    {
        System.out.println("Aranılan element :" + Locater);
        untilElementPresence(Locater);
        return driver.findElement(Locater);
    }

    public void clickElement(By Locater)
    {
        System.out.println("Elemente tıklanıyor...");
        WebElement element = findElement(Locater);
        untilElementDisplayed(Locater);
        untilElementClickable(Locater);
        element.click();
        System.out.println("Elemente tıklandı...");
        
    }

    public void sendKeys(By Locater, String text, boolean... submit)
    {
        WebElement element = findElement(Locater);
        System.out.println("Element temizleniyor");
        untilElementDisplayed(Locater);
        element.clear();
        System.out.println("Yazılan element :" + Locater + "-" + text);
        untilElementClickable(Locater);
        element.sendKeys(text);
        if (submit.length > 0 && submit[0])
        {
            element.submit();
        }
    }

    @After
    public void endDriver()
    {
        driver.quit();
    }



}
