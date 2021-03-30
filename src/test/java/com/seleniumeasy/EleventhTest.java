package com.seleniumeasy;

import com.sun.deploy.util.Waiter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EleventhTest {
    @Test
    public void eleventhTest() throws InterruptedException {
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

        driver.quit();

    }
}