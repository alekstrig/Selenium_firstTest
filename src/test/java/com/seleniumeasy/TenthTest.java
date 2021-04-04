package com.seleniumeasy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;


public class TenthTest extends BaseTest {

        By getInTable = By.xpath("//li[3][@class ='tree-branch']");
        By getInTableFiltr = By.xpath("//li[3][@style]/a[text() = 'Table Filter ']");
        By getButton = By.xpath("//button[@data-target= 'pendiente']");



    @Test
    public <list> void tenthTesn() throws InterruptedException {

        find(getInTable).click();
        find(getInTableFiltr).click();
        scrollToElementWithJS(find(getButton));
        find(getButton).click();
        //WebElement radioButtonsDemo = driver.findElement(By.xpath("//li[@class='tree-branch']/ul/li[3]/a[text() = 'Radio Buttons Demo']"));
        List<WebElement> allSmile = driver.findElements(By.xpath("//tbody/*//i[@class ='media-photo fa fa-smile-o fa-3x']"));


        //WebElement driver = driver.findElements(By.xpath('//i[@style = 'color:orange;']'))
        for (WebElement currentSmile: allSmile) {
            if (currentSmile.isDisplayed()) {
                String colorIs = currentSmile.getAttribute("style");
                Thread.sleep(3000);
                Assert.assertEquals(colorIs, "color: orange;");
            }

        }

    }










        //find(checkButton).click();



        /*WebElement getInTable = driver.findElement(By.xpath("//li[3][@class ='tree-branch']"));
        getInTable.click();

        WebElement getInTableFiltr = driver.findElement(By.xpath("//li[3][@style]/a[text() = 'Table Filter ']"));
        getInTableFiltr.click();

        WebElement getButton = driver.findElement(By.xpath("//button[@data-target= 'pendiente']"));
        getButton.click();

        WebElement checkButton = driver.findElement(By.xpath("//table[@class='table table-filter']"));*/


    }

