package com.studygroup;


import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class Selenium1 extends TestBase {
    private static Logger LOGGER = Logger.getLogger(Selenium1.class);

    @Test(enabled = false)
    public void openbrowser(){

        setupDriver("chrome");
        navigateToURL("https://ebay.com");
        sleepFor(5);
        closeDriver();
    }//li[@data-id='2'][1]



    @Test(enabled = false)
    public void dragAndDrop(){
        setupDriver("chrome");
        navigateToURL("http://demo.guru99.com/test/drag_drop.html");
        sleepFor(5);

        WebElement source = driver.findElement(By.xpath("//li[@data-id='2'][1]"));
        WebElement destination= driver.findElement(By.xpath("//ol[@id='amt7']"));

        Actions actions = new Actions(driver);
        actions.dragAndDrop(source,destination).build().perform();

        sleepFor(7);
        closeDriver();

    }
    @Test (enabled = false)
    public void dropDownAll(){
        setupDriver("chrome");
        LOGGER.info("browser open");
        navigateToURL("https://www.walmart.com/");
        LOGGER.info("Walmart open");
        sleepFor(3);

        WebElement element = driver.findElement(By.xpath("//*[@id=\"global-search-dropdown-toggle\"]/span/img"));
        Select select =new Select(element);
        select.selectByVisibleText("Pets");

        sleepFor(5);
    }


    @Test
    public void validateUseCanTypeInSearchBar() {
        setupDriver("chrome");
        LOGGER.info("browser open");
        navigateToURL("https://www.ebay.com");
        LOGGER.info("ebay open");

        driver.findElement(By.xpath("//*[@id='gh-ac']")).sendKeys("Java books");

        sleepFor(5);
        closeDriver();
    }

    @Test(enabled = false)
    public static void validateUserCanTypeOnSearchBar() {
        setupDriver("chrome");
        navigateToURL("https://www.ebay.com");

        driver.findElement(By.id("gh-ac")).sendKeys("Java Books");
        // driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("Java Books");

        sleepFor(2);
        closeDriver();
    }

    }








