package com.seleniumeasy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;







public class TenthTest extends BaseTest {
    @Test
    public void tenthTesn() {


        WebElement getInTable = driver.findElement(By.xpath("//li[3][@class ='tree-branch']"));
        getInTable.click();

        WebElement getInTableFiltr = driver.findElement(By.xpath("//li[3][@style]/a[text() = 'Table Filter ']"));
        getInTableFiltr.click();

        WebElement getButton = driver.findElement(By.xpath("//button[@data-target= 'pendiente']"));
        getButton.click();

        WebElement checkButton = driver.findElement(By.xpath("//table[@class='table table-filter']"));


    }
}
