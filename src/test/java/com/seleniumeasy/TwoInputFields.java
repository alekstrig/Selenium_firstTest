package com.seleniumeasy;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

    public class TwoInputFields extends BaseTest {

        private By firstInputField = By.xpath("//input[@id='sum1']");
        private By secondInputField = By.xpath("//input[@id='sum2']");
        private By getTotalButton = By.xpath("//button[text()='Get Total']");
        private By displayedText = By.xpath("//span[@id='displayvalue']");

        @Test
        public void checkSumOfTwoNumbers() {

            find(inputFormMenuItem).click();
            find(simpleFormDemoMenuItem).click();

            find(firstInputField).sendKeys("15");
            find(secondInputField).sendKeys("30");

            find(getTotalButton).click();

            String text = find(displayedText).getText();
            Assert.assertEquals(text, "44");


        }

    }

