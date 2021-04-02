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

public class ThirdTest extends BaseTest {

    By checkBoxDemo = By.xpath("//li[@style ='display: list-item;']//a[text() ='Checkbox Demo']");
    By multipleCheckDemoOne = By.xpath("//label[text()='Option 1']");
    By multipleCheckDemoTwo = By.xpath("//label[text()='Option 3']");


    @Test
    public void thirdTest() {

        /*WebElement inputForms = driver.findElement(By.xpath("//a[text()='Input Forms']"));
        inputForms.click();

        WebElement checkBoxDemo = driver.findElement(By.xpath("//li[@style ='display: list-item;']//a[text() ='Checkbox Demo']"));
        checkBoxDemo.click();

        WebElement multipleCheckDemoOne = driver.findElement(By.xpath("//label[text()='Option 1']"));
        multipleCheckDemoOne.click();

        WebElement multipleCheckDemoTwo = driver.findElement(By.xpath("//label[text()='Option 3']"));
        multipleCheckDemoTwo.click();*/

        find(inputFormMenuItem).click();
        find(checkBoxDemo).click();
        find(multipleCheckDemoOne).click();
        find(multipleCheckDemoTwo).click();

        Boolean clickCheckBoxesOne = find(multipleCheckDemoOne).isEnabled();
        Boolean clickCheckBoxesTwo = find(multipleCheckDemoTwo).isEnabled();



        Assert.assertTrue(clickCheckBoxesOne,"Falls");
        Assert.assertTrue(clickCheckBoxesTwo,"Falls");




    }

}
