/*package com.seleniumeasy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SelectListDemo extends BaseTest {

    private By dropDownListMenuItem = By.xpath("//ul[@id='treemenu']//a[text()='Select Dropdown List']");
    private By daysSelector = By.xpath("//select[@id='select-demo']");

    @Test
    public void checkThatFridayAppears() {

        find(inputFormMenuItem).click();
        find(dropDownListMenuItem).click();


        WebElement selector = find(daysSelector);
        pickFromSelect(selector, "Friday");

        String displayedDay = driver.findElement(By.xpath("//select[@id='select-demo']/following-sibling::p")).getText();


        String actualDay = getPartOfString(displayedDay, ":- ", 1);

        assertEquals(actualDay, "Friday");


    }


}
*/