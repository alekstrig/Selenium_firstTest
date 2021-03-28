package com.seleniumeasy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class EighthTest {
    @Test
    public void eighthTest() {
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
        WebElement datePickers = driver.findElement(By.xpath("//*[text() = 'Date pickers']"));
        datePickers.click();
        WebElement bootstrapDatePikers = driver.findElement(By.xpath("//li[@style = 'display: list-item;']//li/a[text() = 'Bootstrap Date Picker']"));
        bootstrapDatePikers.click();

        WebElement setDate = driver.findElement(By.xpath("//input[@placeholder = 'dd/mm/yyyy']"));
        setDate.click();
        //setDate.sendKeys(Keys.ENTER);
        LocalDateTime today = LocalDateTime.now();
        WebElement setDay = driver.findElement(By.xpath("//div[@class = 'datepicker-days']/table/tfoot/tr/th[text() = 'Clear']"));
        setDay.click();

        LocalDateTime yesterday = today.minusDays(1); //today: "2021-03-26T20:11:
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String correctDate = yesterday.format(formatter);

        setDate.sendKeys(correctDate);
        System.out.println(correctDate);





    }
}
