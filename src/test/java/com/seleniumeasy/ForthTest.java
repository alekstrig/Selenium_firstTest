package com.seleniumeasy;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForthTest extends BaseTest  {

    private By radioButtonsDemoItem = By.xpath("//li[@class='tree-branch']/ul/li[3]/a[text() = 'Radio Buttons Demo']");
    private By maleButton = By.xpath("//h4[text() = 'Sex : ']/following-sibling::label[1]");
    private By ageGroup = By.xpath("//input[@value = '5 - 15']");
    private By getValues = By.xpath("//div[@class ='panel-body']/button[@class = 'btn btn-default']");
    private By checkGetValues = By.xpath("//p[@class ='groupradiobutton']");


    @Test
    public void forthTest() throws InterruptedException {

        find(inputFormMenuItem).click();
        find(radioButtonsDemoItem).click();

        scrollToElementWithJS(find(maleButton));
        find(maleButton).click();
        find(ageGroup).click();
        find(getValues).click();


        String text = find(checkGetValues).getText();
        Assert.assertEquals(text,"Sex : Male\nAge group: 5 - 15");



       // WebElement inputForms = driver.findElement(By.xpath("//a[text()='Input Forms']"));
       // inputForms.click();

       // WebElement radioButtonsDemo = driver.findElement(By.xpath("//li[@class='tree-branch']/ul/li[3]/a[text() = 'Radio Buttons Demo']"));
       // radioButtonsDemo.click();

       // WebElement sexMale = driver.findElement(By.xpath("//h4[text() = 'Sex : ']/following-sibling::label[1]"));
       // clickToElementWithJS(sexMale);

        /*JavascriptExecutor executorMale = (JavascriptExecutor)driver;
        executorMale.executeScript("arguments[0].click();", sexMale); */

        //WebElement ageGroup = driver.findElement(By.xpath("//input[@value = '5 - 15']"));
        //clickToElementWithJS(ageGroup);
       /*JavascriptExecutor executorAge = (JavascriptExecutor)driver;
        executorAge.executeScript("arguments[0].click();", ageGroup);

        WebElement getValues = driver.findElement(By.xpath("//div[@class ='panel-body']/button[@class = 'btn btn-default']"));
        clickToElementWithJS(getValues);
       JavascriptExecutor executorValues = (JavascriptExecutor)driver;
        executorValues.executeScript("arguments[0].click();", getValues);*/


        //WebElement checkGetValues = driver.findElement(By.xpath("//p[@class = 'groupradiobutton' and text() = 'Sex : Male']"));


    }
}

