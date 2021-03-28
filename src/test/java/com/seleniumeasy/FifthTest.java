package com.seleniumeasy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.internal.BaseTestMethod;

import java.security.Key;

public class FifthTest  {  //extends PrimeTest
    @Test
    public void fifthTest() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.seleniumeasy.com/test/"); //visibilityOfAllElementsLocatedBy
        try {
            new WebDriverWait(driver, 5).until(ExpectedConditions
                    .visibilityOfElementLocated(By.xpath("//*[@id = 'at-cv-lightbox-close']")));
            WebElement destrButton = driver.findElement(By.xpath("//*[@id = 'at-cv-lightbox-close']"));
            destrButton.click();
        } catch (Exception e) {
            System.out.println("hjdsgfjh");
        }

        WebElement inputForms = driver.findElement(By.xpath("//a[text()='Input Forms']"));
        inputForms.click();

        WebElement dropDownList = driver.findElement(By.xpath("//li[@class = 'tree-branch']/*/li/a[text() = 'Select Dropdown List']"));
        dropDownList.click();

        WebElement selectDemo = driver.findElement(By.xpath("//select[@id = 'select-demo']"));
        selectDemo.sendKeys(Keys.ENTER);
        WebElement selectDay = driver.findElement(By.xpath("//select[@id='select-demo']/option[text() = 'Tuesday']"));
        selectDay.click();

        Assert.assertEquals(selectDay.getText(), "Tuesday");

        driver.quit();



    }
}



