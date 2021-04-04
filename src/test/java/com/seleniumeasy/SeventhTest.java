package com.seleniumeasy;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeventhTest extends BaseTest {
            By ajaxFormSubMit = By.xpath("//li[@class = 'tree-branch']//a[text() = 'Ajax Form Submit']");
            By subMitButton = By.xpath("//input[@id ='btn-submit']");


    @Test
    public void seventhTest() throws InterruptedException {

        find(inputFormMenuItem).click();
        find(ajaxFormSubMit).click();
        find(subMitButton).click();


        String borderColor = find(subMitButton).getCssValue("border-bottom-color");
        Assert.assertEquals(borderColor,"rgba(32, 77, 116, 1)");




       /* WebElement inputForms = driver.findElement(By.xpath("//a[text()='Input Forms']"));
        inputForms.click();

        WebElement ajaxFormSubMit = driver.findElement(By.xpath("//li[@class = 'tree-branch']//a[text() = 'Ajax Form Submit']"));
        ajaxFormSubMit.click();
        WebElement subMitButton = driver.findElement(By.xpath("//input[@id ='btn-submit']"));
        subMitButton.click();
        System.out.println(subMitButton.getCssValue("border-bottom-color"));

        */



    }
}

