package com.seleniumeasy;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class BaseTest {

    @Test
    public void firstTest() {

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

        WebElement inputForms = driver.findElement(By.xpath("//a[text()='Input Forms']"));
        inputForms.click();

        WebElement simpleFormDemo = driver.findElement(By.xpath("//ul[@id = 'treemenu'] //a[text()='Simple Form Demo']"));
        simpleFormDemo.click();

        WebElement inputField = driver.findElement(By.id("user-message"));
        inputField.click();

        inputField.sendKeys("Hello, my name is"); //

        WebElement showMessageButton = driver.findElement(By.xpath("//button[contains(text(), 'Show Message')]"));
        showMessageButton.click();
        WebElement checkMessageButton  = driver.findElement(By.xpath("//span[text() = 'Hello, my name is']"));
        Boolean displayed = checkMessageButton.isDisplayed();
        Assert.assertTrue(displayed, "Test passed");        //Assert.assertTrue(displayed);

        driver.quit();


    }
    @Test
    public void secondTest() {
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
        WebElement inputForms = driver.findElement(By.xpath("//a[text()='Input Forms']"));
        inputForms.click();

        WebElement simpleFormDemo = driver.findElement(By.xpath("//ul[@id = 'treemenu'] //a[text()='Simple Form Demo']"));
        simpleFormDemo.click();

        WebElement inputField = driver.findElement(By.id("user-message"));
        inputField.click();

        WebElement.



        //driver.quit();


    }


}
