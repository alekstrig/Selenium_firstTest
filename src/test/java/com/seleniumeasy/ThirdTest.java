package com.seleniumeasy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ThirdTest extends PrimeTest {
    @Test
    public void thirdTest() {
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

        WebElement checkBoxDemo = driver.findElement(By.xpath("//li[@style ='display: list-item;']//a[text() ='Checkbox Demo']"));
        checkBoxDemo.click();

        WebElement multipleCheckDemoOne = driver.findElement(By.xpath("//label[text()='Option 1']"));
        multipleCheckDemoOne.click();

        WebElement multipleCheckDemoTwo = driver.findElement(By.xpath("//label[text()='Option 3']"));
        multipleCheckDemoTwo.click();

        Assert.assertTrue(multipleCheckDemoOne.isEnabled(),"Falls");
        Assert.assertTrue(multipleCheckDemoTwo.isEnabled(),"Falls");




    }

}