package com.seleniumeasy;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class BaseTest {   //extends

    @Test
    public void firstTest() {

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

        inputField.sendKeys("Hello, my name is"); //

        WebElement showMessageButton = driver.findElement(By.xpath("//button[contains(text(), 'Show Message')]"));
        showMessageButton.click();
        WebElement checkMessageButton  = driver.findElement(By.xpath("//span[@id = 'display']"));
        checkMessageButton.getText();
        Assert.assertEquals(checkMessageButton.getText(), "Hello, my name is" );

        driver.quit();


    }
    @Test
    public void secondTest() {
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

        WebElement twoInputFieldA = driver.findElement(By.xpath("//input[@id='sum1']"));
        twoInputFieldA.click();
        twoInputFieldA.sendKeys("5");

        WebElement twoInputFieldB = driver.findElement(By.xpath("//input[@id='sum2']"));
        twoInputFieldB.click();
        twoInputFieldB.sendKeys("10");

        WebElement getTotal = driver.findElement(By.xpath("//form[@id = 'gettotal']/*[@class = 'btn btn-default']"));
        getTotal.click();

        WebElement checkElementTotal = driver.findElement(By.xpath("//span[@id = 'displayvalue']"));
        checkElementTotal.getText();
        Assert.assertEquals(checkElementTotal.getText(),"15");
        driver.quit();


    }

    @Test
    public void thirdTest() {
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

        WebElement checkBoxDemo = driver.findElement(By.xpath("//li[@style ='display: list-item;']//a[text() ='Checkbox Demo']"));
        checkBoxDemo.click();

        WebElement multipleCheckDemoOne = driver.findElement(By.xpath("//label[text()='Option 1']"));
        multipleCheckDemoOne.click();

        WebElement multipleCheckDemoTwo = driver.findElement(By.xpath("//label[text()='Option 3']"));
        multipleCheckDemoTwo.click();

        Assert.assertTrue(multipleCheckDemoOne.isEnabled(),"Falls");
        Assert.assertTrue(multipleCheckDemoTwo.isEnabled(),"Falls");

        driver.quit();


    }
    @Test
    public void forthTest() {
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

        WebElement radioButtonsDemo = driver.findElement(By.xpath("//li[@class='tree-branch']/ul/li[3]/a[text() = 'Radio Buttons Demo']"));
        radioButtonsDemo.click();

        WebElement sexMale = driver.findElement(By.xpath("//h4[text() = 'Sex : ']/following-sibling::label[1]"));
        JavascriptExecutor executorMale = (JavascriptExecutor)driver;
        executorMale.executeScript("arguments[0].click();", sexMale);

        WebElement ageGroup = driver.findElement(By.xpath("//input[@value = '5 - 15']"));
        JavascriptExecutor executorAge = (JavascriptExecutor)driver;
        executorAge.executeScript("arguments[0].click();", ageGroup);

        WebElement getValues = driver.findElement(By.xpath("//div[@class ='panel-body']/button[@class = 'btn btn-default']"));
        JavascriptExecutor executorValues = (JavascriptExecutor)driver;
        executorValues.executeScript("arguments[0].click();", getValues);


        WebElement checkGetValues = driver.findElement(By.xpath("//p[@class = 'groupradiobutton' and text() = 'Sex : Male']"));

        Assert.assertEquals(checkGetValues.getText(),"Sex : Male\nAge group: 5 - 15");


        driver.quit();






    }







}
