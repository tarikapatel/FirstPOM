package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class RegistrationPage extends Utils{
    By _firstName = By.id("FirstName");
    By _lastName = By.id("LastName");
    By _email = By.id("Email");
    By _password = By.id("Password");
    By _confirmPassword = By.id("ConfirmPassword");
    By _clickOnRegisterButton = By.id("register-button");

    public void verifyUserIsOnRegisterPage(){
        Assert.assertTrue(driver.getCurrentUrl().contains("register"));
    }
    public void userEntersRegistrationDetails(){
        LoadProp loadProp = new LoadProp();
        //Type first name
        typeText(_firstName,loadProp.getProperty("firstName"));
        //type second name

        typeText(_lastName,loadProp.getProperty("lastName"));
        //select day from dropdown
        Select selectDay = new Select(driver.findElement(By.name("DateOfBirthDay")));
        selectDay.selectByVisibleText("15");
        //select month from dropdown
        Select selectMonth = new Select(driver.findElement(By.name("DateOfBirthMonth")));
        selectMonth.selectByValue("4");
        //select year from dropdown
        Select selectYear = new Select(driver.findElement(By.name("DateOfBirthYear")));
        selectYear.selectByValue("1926");
        //Type email
        String email = "Johnsmith+" + currentTimeStamp() + "@gmail.com";
        System.out.println(email);
        typeText(_email,(email));
        //wait
        waitForVisible(By.id("Newsletter"), 20);
        //click on Newsletter checkbox
        clickOnElement(By.id("Newsletter"));
        //Type password
        typeText(_password, "Test123!");
        //type confirm password
        typeText(_confirmPassword, "Test123!");

    }
    public void clickOnRegisterButton(){
        //click on register button
        clickOnElement(_clickOnRegisterButton);
    }
}
