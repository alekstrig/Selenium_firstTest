package com.seleniumeasy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BootstrapDatePickers extends BaseTest {

    @Test
    public void checkYesterdayDate() throws InterruptedException {


        driver.findElement(By.xpath("//ul[@id='treemenu']//a[text()='Date pickers']")).click();
        driver.findElement(By.xpath("//ul[@id='treemenu']//a[text()='Bootstrap Date Picker']")).click();


        WebElement elementToScroll = find(By.xpath("//div[@id='sandbox-container1']//span[@class='input-group-addon']"));
        scrollToElementWithJS(elementToScroll);

        driver.findElement(By.xpath("//div[@id='sandbox-container1']//span[@class='input-group-addon']")).click();

        waitUntilVisibility(By.xpath("//div[@class='datepicker-days']"));

        String yesterdayDateInValidFormat = getYesterdayDateInFormat("dd/MM/yyyy");

        int dayOfMonth = getYesterdayDay();

        driver.findElement(By.xpath("//td[text()='" + dayOfMonth + "' and not(contains(@class,'disabled'))]")).click();

        String value = driver.findElement(By.xpath("//div[@id='sandbox-container1']//input")).getAttribute("value");

        Assert.assertEquals(value, yesterdayDateInValidFormat);

        driver.quit();
    }


}
