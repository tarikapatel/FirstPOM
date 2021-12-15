package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

import static java.lang.System.getProperty;
import static org.testng.Assert.assertEquals;

public class RegistrationResultPage extends Utils {

    public void verifyUserIsOnRegisterSuccessPage() {
        //  System.out.println(driver.getCurrentUrl());
        Assert.assertTrue(driver.getCurrentUrl().contains(loadProp.getProperty("UserIsOnRegisterSuccessPagecontains")));

    }

    public void verifyUserHasSuccessfullyRegistered() {
        // Verify expected result is equal to actual result
        String actualRegisterSuccessMessage = getTextFromElement(By.xpath("//div[@class='result']"));
        String expectedRegisterSuccessMessage = loadProp.getProperty("expectedRegisterSuccessMessage");
        assertEquals(actualRegisterSuccessMessage, expectedRegisterSuccessMessage);
    }
}