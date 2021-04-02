package com.seleniumeasy;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


public class FirstTest extends BaseTest {   //extends

    private By inputField = By.xpath("//input[@id='user-message']");
    private By showMessageButton = By.xpath("//button[text()='Show Message']");
    private By checkMessageButton = By.xpath("//span[@id = 'display']");

    @Test
    public void firstTest() {
        String textExpected = "Hello, my name is Sasha";

       /* WebElement inputForms = driver.findElement(By.xpath("//a[text()='Input Forms']"));
        inputForms.click();

        WebElement simpleFormDemo = driver.findElement(By.xpath("//ul[@id = 'treemenu'] //a[text()='Simple Form Demo']"));
        simpleFormDemo.click();

        WebElement inputField = driver.findElement(By.id("user-message"));
        inputField.click();

        inputField.sendKeys("Hello, my name is"); //

        WebElement showMessageButton = driver.findElement(By.xpath("//button[text()='Show Message']"));
        showMessageButton.click();
        WebElement checkMessageButton = driver.findElement(By.xpath("//span[@id = 'display']"));
        checkMessageButton.getText();*/

        find(inputFormMenuItem).click();
        find(simpleFormDemoMenuItem).click();
        find(inputField).sendKeys(textExpected);
        find(showMessageButton).click();

        String textActual = find(checkMessageButton).getText();
        Assert.assertEquals(textActual,textExpected);

    }
}








