package com.seleniumeasy;

import io.github.bonigarcia.wdm.WebDriverManager;
import javafx.css.StyleableObjectProperty;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.border.Border;
import javax.swing.text.Style;

public class SeventhTest extends BaseTest {
    @Test
    public void seventhTest() {


        WebElement inputForms = driver.findElement(By.xpath("//a[text()='Input Forms']"));
        inputForms.click();

        WebElement ajaxFormSubMit = driver.findElement(By.xpath("//li[@class = 'tree-branch']//a[text() = 'Ajax Form Submit']"));
        ajaxFormSubMit.click();
        WebElement subMitButton = driver.findElement(By.xpath("//input[@id ='btn-submit']"));
        subMitButton.click();
        System.out.println(subMitButton.getCssValue("border-bottom-color"));

        Assert.assertEquals(subMitButton.getCssValue("border-bottom-color"),"rgba(32, 77, 116, 1)");



    }
}

