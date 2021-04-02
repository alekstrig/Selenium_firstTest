package com.seleniumeasy;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EleventhTest extends BaseTest {
    @Test
    public void eleventhTest() throws InterruptedException {


        WebElement getAlertsModals = driver.findElement(By.xpath("//a[text() ='Alerts & Modals']"));
        getAlertsModals.click();
        WebElement getJSAlerts = driver.findElement(By.xpath("//li[@style = 'display: list-item;']//a[text() ='Javascript Alerts']"));
        getJSAlerts.click();
        WebElement clickMe = driver.findElement(By.xpath("//button[@onclick = 'myConfirmFunction()']"));
        JavascriptExecutor executorValues = (JavascriptExecutor)driver;
        executorValues.executeScript("arguments[0].click();", clickMe);

        /*Actions actions = new Actions(driver);
        actions.moveToElement(clickMe).click(clickMe).build().perform();
        clickMe.click();*/
        Alert ale = driver.switchTo().alert();
        ale.dismiss();



        WebElement checkCancelAlert = driver.findElement(By.xpath("//p[@id = 'confirm-demo']"));
        Assert.assertEquals(checkCancelAlert.getText(),"You pressed Cancel!");



    }
}
