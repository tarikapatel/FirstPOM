package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils extends BrowserManager{
    public static void clickOnElement(By by)
    {
        driver.findElement(by).click();
    }

    public static void typeText(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    public static String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    public static String currentTimeStamp() {
        return (new SimpleDateFormat("ddMMyyyyhhmmss")).format(new Date());
    }

    public static void waitForClickable(By by, int timeInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, timeInSeconds);
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    public static void waitForVisible(By by, int timeInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, timeInSeconds);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }
    public static void selectByDropDownIndexValue (By by, String day){
        Select select_date = new Select(driver.findElement(by));
        select_date.selectByIndex(Integer.parseInt(String.valueOf(day)));
    }
    public static void selectByValue (By by, String month) {
        Select select_month = new Select(driver.findElement(by));
        select_month.selectByValue(month);
    }
    public static void selectDropDownByVisibleText(By by, String year){
        Select select_year = new Select(driver.findElement(by));
        select_year.selectByVisibleText(year);
    }

    public static void captureScreenshot(String fileName)
    {
        //convert web driver object to TakeScreenshot
        TakesScreenshot scrshot = ((TakesScreenshot) driver);
        //call getScreenshotAs method to create image file
        File SrcFile=scrshot.getScreenshotAs(OutputType.FILE);
        //Move image file to new destination
        File destFile= new File("src/test/Screenshots" +fileName+""+currentTimeStamp()+".png");
        //copy file at destination
        try {
            FileUtils.copyFile(SrcFile, destFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
