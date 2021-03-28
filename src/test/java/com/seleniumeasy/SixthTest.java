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

public class SixthTest {
    @Test
    public void sixthTest() {
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

        WebElement selectFlorida = driver.findElement(By.xpath("//option[text() = 'Florida']"));
        selectFlorida.click();
        WebElement selectNewYork = driver.findElement(By.xpath("//option[text() = 'New York']"));
        WebElement printAll = driver.findElement(By.xpath("//button[@id ='printAll']"));

        Actions actions = new Actions(driver);
        actions.keyDown(Keys.CONTROL).click(selectNewYork).click(printAll).keyUp(Keys.CONTROL).build().perform();

        WebElement checkPrintAll = driver.findElement(By.xpath("//p[@class = 'getall-selected']"));
        Assert.assertEquals(checkPrintAll.getText(), "Options selected are : Florida,New York");

        driver.quit();

    }
}
