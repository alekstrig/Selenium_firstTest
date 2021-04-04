/*package com.seleniumeasy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MultiSelectListDemo {

    @Test
    public void test4() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.seleniumeasy.com/test/");

        try {
            WebElement exit = new WebDriverWait(driver, 5)
                    .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='at-cv-lightbox-close']")));
            exit.click();
        } catch (NoSuchElementException e) {
            System.out.println("No any adv appears");
        }

        driver.findElement(By.xpath("//a[text()='Input Forms']")).click();
        driver.findElement(By.xpath("//ul[@id='treemenu']//a[text()='Select Dropdown List']")).click();


        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.id("select-demo")));
        Thread.sleep(1000);

        new WebDriverWait(driver, 10).until(
                ExpectedConditions.elementToBeClickable(By.xpath("//option[@value='New York']")));



        Actions actions = new Actions(driver);
        actions.keyDown(Keys.LEFT_CONTROL);

        actions.pause(500);
        actions.moveToElement(driver.findElement(By.xpath("//option[@value='New York']"))).click();
        actions.pause(500);
        actions.moveToElement(driver.findElement(By.xpath("//option[@value='Florida']"))).click();
        actions.pause(500);
        actions.keyUp(Keys.LEFT_CONTROL);
        actions.pause(500);
        actions.build().perform();


        driver.findElement(By.id("printAll")).click();

        String text = driver.findElement(By.xpath("//p[@class='getall-selected']")).getText();
        String[] split = text.split(" : ");

        Assert.assertEquals(split[1], "New York,Florida");

        driver.quit();
    }


}*/
