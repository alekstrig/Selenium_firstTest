package com.seleniumeasy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

    public class NinthTest {
    @Test
    public void ninthTest() {
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
        WebElement openTable = driver.findElement(By.xpath("//a[text() ='Table']"));
        openTable.click();
        WebElement openTableDataSearch = driver.findElement(By.xpath("//li[@style = 'display: list-item;']//a[text() = 'Table Data Search']"));
        openTableDataSearch.click();
        WebElement inputField = driver.findElement(By.xpath("//input[@id = 'task-table-filter']"));
        inputField.click();
        inputField.sendKeys("Emily John", Keys.ENTER);

        WebElement checkInput = driver.findElement(By.xpath("//table[@id ='task-table' ]/tbody"));
        Assert.assertEquals(checkInput.getText(), "4 Bootstrap 3 Emily John in progress");

        driver.quit();




    }

}
