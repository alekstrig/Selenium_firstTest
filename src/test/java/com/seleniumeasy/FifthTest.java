package com.seleniumeasy;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FifthTest extends BaseTest  {  //extends PrimeTest

    By dropDownList = By.xpath("//li[@class = 'tree-branch']/*/li/a[text() = 'Select Dropdown List']");
    By selectDemo = By.xpath("//select[@id = 'select-demo']");
    By selectDay = By.xpath("//select[@id='select-demo']/option[text() = 'Tuesday']");


    @Test
    public void fifthTest() {

     find(inputFormMenuItem).click();
     find(dropDownList).click();
     find(selectDemo).sendKeys(Keys.ENTER);
     find(selectDay).click();

    /*public void fifthTest() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.seleniumeasy.com/test/"); //visibilityOfAllElementsLocatedBy
        try {
            new WebDriverWait(driver, 5).until(ExpectedConditions
                    .visibilityOfElementLocated(By.xpath("//*[@id = 'at-cv-lightbox-close']")));
            WebElement destrButton = driver.findElement(By.xpath("//*[@id = 'at-cv-lightbox-close']"));
            destrButton.click();
        } catch (Exception e) {
            System.out.println("hjdsgfjh");
        }*/

        //WebElement inputForms = driver.findElement(By.xpath("//a[text()='Input Forms']"));
        //inputForms.click();

        //WebElement dropDownList = driver.findElement(By.xpath("//li[@class = 'tree-branch']/*/li/a[text() = 'Select Dropdown List']"));
        //dropDownList.click();

        //WebElement selectDemo = driver.findElement(By.xpath("//select[@id = 'select-demo']"));
        //selectDemo.sendKeys(Keys.ENTER);
        //WebElement selectDay = driver.findElement(By.xpath("//select[@id='select-demo']/option[text() = 'Tuesday']"));
        //selectDay.click();
        String text = find(selectDay).getText();
        Assert.assertEquals(text, "Tuesday");

    }
}



