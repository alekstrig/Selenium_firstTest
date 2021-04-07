package com.seleniumeasy;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EleventhTest extends BaseTest {

        private final By getAlertsModals = By.xpath("//a[text() ='Alerts & Modals']");
        private final By getJSAlerts = By.xpath("//li[@style = 'display: list-item;']//a[text() ='Javascript Alerts']");
        private final By clickMe = By.xpath("//button[@onclick = 'myConfirmFunction()']");
        private final By checkCancelAlert = By.xpath("//p[@id = 'confirm-demo']");

    @Test
    public void eleventhTest() throws InterruptedException {

        find(getAlertsModals).click();
        find(getJSAlerts).click();
        find(clickMe).click();
        Thread.sleep(1200);
        Alert ale = driver.switchTo().alert();
        ale.dismiss();

        String checkText = find(checkCancelAlert).getText();
        Assert.assertEquals(checkText,"You pressed Cancel!");




        /*WebElement getAlertsModals = driver.findElement(By.xpath("//a[text() ='Alerts & Modals']"));
        getAlertsModals.click();
        WebElement getJSAlerts = driver.findElement(By.xpath("//li[@style = 'display: list-item;']//a[text() ='Javascript Alerts']"));
        getJSAlerts.click();
        WebElement clickMe = driver.findElement(By.xpath("//button[@onclick = 'myConfirmFunction()']"));
        JavascriptExecutor executorValues = (JavascriptExecutor)driver;
        executorValues.executeScript("arguments[0].click();", clickMe);*/

        /*Actions actions = new Actions(driver);
        actions.moveToElement(find(clickMe)).click(find()clickMe).build().perform();
        clickMe.click();
       Alert ale = driver.switchTo().alert();
        Thread.sleep(5000);
        ale.dismiss();*/








    }
}
