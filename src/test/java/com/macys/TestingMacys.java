package com.macys;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

//http://demo.automationtesting.in/Frames.html  (for iframe)

public class TestingMacys {
    WebDriver driver;

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/dibashsaha/Desktop/com.macy/Driverhere/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://jqueryui.com/checkboxradio/");
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }

  // @Test
    public void ValidateIframe() throws InterruptedException {
        WebElement frame=driver.findElement(By.xpath("//*[@id=\"singleframe\"]"));
        driver.switchTo().frame(frame);

       WebElement box=driver.findElement(By.xpath("/html/body/section/div/div/div/input"));
      box.sendKeys("home now");
Thread.sleep(3000);
   }
@Test
   public void checkbox() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[2]/ul/li[3]/a")).click();
//driver.findElement(By.xpath("//button[@class='ui-button ui-corner-all ui-widget']")).click();
Thread.sleep(4000);
   }


}