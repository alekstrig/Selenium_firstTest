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

public class SecondTest extends PrimeTest {
    @Test
    public void secondTest() {
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

        WebElement simpleFormDemo = driver.findElement(By.xpath("//ul[@id = 'treemenu'] //a[text()='Simple Form Demo']"));
        simpleFormDemo.click();

        WebElement inputField = driver.findElement(By.id("user-message"));
        inputField.click();

        WebElement twoInputFieldA = driver.findElement(By.xpath("//input[@id='sum1']"));
        twoInputFieldA.click();
        twoInputFieldA.sendKeys("5");

        WebElement twoInputFieldB = driver.findElement(By.xpath("//input[@id='sum2']"));
        twoInputFieldB.click();
        twoInputFieldB.sendKeys("10");

        WebElement getTotal = driver.findElement(By.xpath("//form[@id = 'gettotal']/*[@class = 'btn btn-default']"));
        getTotal.click();

        WebElement checkElementTotal = driver.findElement(By.xpath("//span[@id = 'displayvalue']"));
        checkElementTotal.getText();
        Assert.assertEquals(checkElementTotal.getText(), "15");
    }
}