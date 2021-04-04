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

    public class NinthTest extends BaseTest {

        By openTable = By.xpath("//a[text() ='Table']");
        By openTableDataSearch = By.xpath("//li[@style = 'display: list-item;']//a[text() = 'Table Data Search']");
        By inputField = By.xpath("//input[@id = 'task-table-filter']");
        By checkInput = By.xpath("//table[@id ='task-table' ]/tbody");




    @Test
    public void ninthTest() throws InterruptedException {

        find(openTable).click();
        find(openTableDataSearch).click();
        find(inputField).click();
        find(inputField).sendKeys("Emily John", Keys.ENTER);
        String checkText = find(checkInput).getText();

        Assert.assertEquals(checkText, "4 Bootstrap 3 Emily John in progress");




        /*WebElement openTable = driver.findElement(By.xpath("//a[text() ='Table']"));
        openTable.click();
        WebElement openTableDataSearch = driver.findElement(By.xpath("//li[@style = 'display: list-item;']//a[text() = 'Table Data Search']"));
        openTableDataSearch.click();
        WebElement inputField = driver.findElement(By.xpath("//input[@id = 'task-table-filter']"));
        inputField.click();
        inputField.sendKeys("Emily John", Keys.ENTER);

        WebElement checkInput = driver.findElement(By.xpath("//table[@id ='task-table' ]/tbody"));*/






    }

}
