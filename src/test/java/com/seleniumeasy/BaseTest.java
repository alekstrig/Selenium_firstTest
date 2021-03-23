package com.seleniumeasy;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BaseTest {

    @Test
    public void checkMessageButton() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.seleniumeasy.com/test/"); //visibilityOfAllElementsLocatedBy
        try{
            new WebDriverWait(driver,5).until(ExpectedConditions
                    .visibilityOfElementLocated(By.xpath("//*[@id = 'at-cv-lightbox-close']")));
            WebElement destrButton = driver.findElement(By.xpath("//*[@id = 'at-cv-lightbox-close']"));
            destrButton.click();
        }
        catch (Exception e){
            System.out.println("hjdsgfjh");
        }

        WebElement inputForms = driver.findElement(By.xpath("//a[text()='Input Forms']"));
        inputForms.click();
        WebElement simpleFormDemo = driver.findElement(By.xpath("//ul[@id = 'treemenu'] //a[text()='Simple Form Demo']"));
        simpleFormDemo.click();
        WebElement inputField = driver.findElement(By.id("user-message"));
        inputField.click();
        inputField.sendKeys("Hello, my name is");



        //driver.quit();

    }
}
