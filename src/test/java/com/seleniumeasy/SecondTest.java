package com.seleniumeasy;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTest extends BaseTest {

    private By twoInputFieldA = By.xpath("//input[@id='sum1']");
    private By twoInputFieldB = By.xpath("//input[@id='sum2']");
    private By getTotal = By.xpath("//button[text()='Get Total']");
    private By checkElementTotal = By.xpath("//span[@id = 'displayvalue']");



    @Test
    public void secondTest  () {

        /*WebElement inputForms = driver.findElement(By.xpath("//a[text()='Input Forms']"));
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
        checkElementTotal.getText();*/

        find(inputFormMenuItem).click();
        find(simpleFormDemoMenuItem).click();

        find(twoInputFieldA).sendKeys("15");
        find(twoInputFieldB).sendKeys("45");

        find(getTotal).click();

        String textActual = find(checkElementTotal).getText();

        Assert.assertEquals(textActual, "60");
    }
}
