package com.seleniumeasy;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ThirdTest extends BaseTest {

     private final By checkBoxDemo = By.xpath("//li[@style ='display: list-item;']//a[text() ='Checkbox Demo']");
     private final By multipleCheckDemoOne = By.xpath("//label[text()='Option 1']");
     private final By multipleCheckDemoTwo = By.xpath("//label[text()='Option 3']");


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

        boolean clickCheckBoxesOne = find(multipleCheckDemoOne).isEnabled();
        boolean clickCheckBoxesTwo = find(multipleCheckDemoTwo).isEnabled();



        Assert.assertTrue(clickCheckBoxesOne,"Falls");
        Assert.assertTrue(clickCheckBoxesTwo,"Falls");




    }

}
