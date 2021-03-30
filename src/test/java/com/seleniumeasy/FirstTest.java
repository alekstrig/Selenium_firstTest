package com.seleniumeasy;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;


public class FirstTest extends BaseTest {   //extends

    @Test
    public void firstTest() {

        WebElement inputForms = driver.findElement(By.xpath("//a[text()='Input Forms']"));
        inputForms.click();

        WebElement simpleFormDemo = driver.findElement(By.xpath("//ul[@id = 'treemenu'] //a[text()='Simple Form Demo']"));
        simpleFormDemo.click();

        WebElement inputField = driver.findElement(By.id("user-message"));
        inputField.click();

        inputField.sendKeys("Hello, my name is"); //

        WebElement showMessageButton = driver.findElement(By.xpath("//button[contains(text(), 'Show Message')]"));
        showMessageButton.click();
        WebElement checkMessageButton = driver.findElement(By.xpath("//span[@id = 'display']"));
        checkMessageButton.getText();
        Assert.assertEquals(checkMessageButton.getText(), "Hello, my name is");

    }
}








