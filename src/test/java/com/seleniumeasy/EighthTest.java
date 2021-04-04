package com.seleniumeasy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class EighthTest extends BaseTest {

        By datePickers = By.xpath("//*[text() = 'Date pickers']");
        By bootstrapDatePikers = By.xpath("//li[@style = 'display: list-item;']//li/a[text() = 'Bootstrap Date Picker']");
        By setDate = By.xpath("//input[@placeholder = 'dd/mm/yyyy']");
        By checkSetDate = By.xpath("//input[@placeholder = 'dd/mm/yyyy']");


    @Test
    public void eighthTest() throws InterruptedException {

        find(datePickers).click();
        find(bootstrapDatePikers).click();
        scrollToElementWithJS(find(setDate));
        find(setDate).click();
        find(setDate).sendKeys(getYesterdayDateInFormat("dd/MM/yyyy"));

        String chekText = find(checkSetDate).getAttribute("value");
        Assert.assertEquals(chekText, "03/04/2021");
        Thread.sleep(3000);







       /* WebElement datePickers = driver.findElement(By.xpath("//*[text() = 'Date pickers']"));
        datePickers.click();
        WebElement bootstrapDatePikers = driver.findElement(By.xpath("//li[@style = 'display: list-item;']//li/a[text() = 'Bootstrap Date Picker']"));
        bootstrapDatePikers.click();

        WebElement setDate = driver.findElement(By.xpath("//input[@placeholder = 'dd/mm/yyyy']"));
        setDate.click();
        Actions actions = new Actions(driver);
        actions.moveToElement(setDate).click(setDate).build().perform();

        //setDate.sendKeys(Keys.ENTER);
        LocalDateTime today = LocalDateTime.now();
        //WebElement setDay = driver.findElement(By.xpath("//div[@class = 'datepicker-days']/table/tfoot/tr/th[text() = 'Clear']"));
        //setDay.click();

        LocalDateTime yesterday = today.minusDays(1); //today: "2021-03-26T20:11:
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String correctDate = yesterday.format(formatter);

        setDate.sendKeys(correctDate);


        WebElement checkSetDate = driver.findElement(By.xpath("//input[@placeholder = 'dd/mm/yyyy']"));
        Assert.assertEquals(checkSetDate.getAttribute("value"), "02/04/2021");*/







    }
}
