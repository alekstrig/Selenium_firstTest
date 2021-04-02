package com.seleniumeasy;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleFormDemo extends BaseTest {

    private By enterMessageInputField = By.xpath("//input[@id='user-message']");
    private By showMessageButton = By.xpath("//button[text()='Show Message']");
    private By displayedText = By.xpath("//span[@id='display']");

    @Test
    public void simpleFormDemoTest() {
        String expectedText = "Hello my name is Oleg";

        find(inputFormMenuItem).click();
        find(simpleFormDemoMenuItem).click();
        find(enterMessageInputField).sendKeys(expectedText);
        find(showMessageButton).click();

        String actualText = find(displayedText).getText();
        Assert.assertEquals(actualText, expectedText);
    }


}