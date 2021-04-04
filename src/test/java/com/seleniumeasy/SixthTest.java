package com.seleniumeasy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SixthTest extends BaseTest {

    By dropDownList = By.xpath("//li[@class = 'tree-branch']/*/li/a[text() = 'Select Dropdown List']");
    By selectFlorida = By.xpath("//option[text() = 'Florida']");
    By selectNewYork = By.xpath("//option[text() = 'New York']");
    By printAll = By.xpath("//button[@id ='printAll']");
    By checkPrintAll = By.xpath("//p[@class = 'getall-selected']");

    /*Actions actions = new Actions(driver);
        actions.keyDown(Keys.CONTROL).click(selectNewYork).click(printAll).keyUp(Keys.CONTROL).build().perform();*/


    @Test
    public void sixthTest() throws InterruptedException {

        find(inputFormMenuItem).click();
        find(dropDownList).click();
        find(selectFlorida).click();
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.CONTROL).click(find(selectNewYork)).click(find(printAll)).keyUp(Keys.CONTROL).build().perform();
        find(printAll).click();

        String checkText = find(checkPrintAll).getText();
        Thread.sleep(2000);
        Assert.assertEquals(checkText, "Options selected are : Florida,New York");




        /*WebElement inputForms = driver.findElement(By.xpath("//a[text()='Input Forms']"));
        inputForms.click();

        WebElement dropDownList = driver.findElement(By.xpath("//li[@class = 'tree-branch']/*///li/a[text() = 'Select Dropdown List']"));
        /*dropDownList.click();

        WebElement selectFlorida = driver.findElement(By.xpath("//option[text() = 'Florida']"));
        selectFlorida.click();
        WebElement selectNewYork = driver.findElement(By.xpath("//option[text() = 'New York']"));
        WebElement printAll = driver.findElement(By.xpath("//button[@id ='printAll']"));

        Actions actions = new Actions(driver);
        actions.keyDown(Keys.CONTROL).click(selectNewYork).click(printAll).keyUp(Keys.CONTROL).build().perform();

        WebElement checkPrintAll = driver.findElement(By.xpath("//p[@class = 'getall-selected']"));
        Assert.assertEquals(checkPrintAll.getText(), "Options selected are : Florida,New York");*/


    }
}
