package com.seleniumeasy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

public class PrimeTest {
    @BeforeClass
    public void BaseTestOne() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.seleniumeasy.com/test/"); //visibilityOfAllElementsLocatedBy
        try{
            new WebDriverWait(driver,5).until(ExpectedConditions
                    .visibilityOfElementLocated(By.xpath("//*[@id = 'at-cv-lightbox-close']")));
            WebElement destrButton = driver.findElement(By.xpath("//*[@id = 'at-cv-lightbox-close']"));
            destrButton.click();
        }
        catch (Exception e){
            System.out.println("hjdsgfjh");
        }

        }
       @AfterTest
    public void Finish() {
           WebDriverManager.chromedriver().setup();
           WebDriver driver = new ChromeDriver();
          driver.quit();
          System.out.println("test done");
        }

    }





