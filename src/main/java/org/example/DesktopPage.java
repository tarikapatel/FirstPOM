package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class DesktopPage extends Utils{

    public void verifyUserIsOnDesktopPage(){
        Assert.assertTrue(driver.getCurrentUrl().contains(loadProp.getProperty("UserIsOnDesktopPageUrlContains")));
    }
    public void verifyUserIsShownDesktopMenu(){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        String actualPageTitle = getTextFromElement(By.xpath("//div[@class='page-title']/h1"));
        String expectedPageTitle = loadProp.getProperty("expectedPageTitleForDesktop");
        assertEquals(actualPageTitle, expectedPageTitle);
    }

    public void clickOnBuildYourOwnComputer(){
        clickOnElement(By.xpath("//div[@class='product-item']/div[2]/h2/a[@href='/build-your-own-computer']"));
    }

}
