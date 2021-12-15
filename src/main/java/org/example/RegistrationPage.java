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
    By _DateOfBirthDay = By.name("DateOfBirthDay");
    By _DateOfBirthMonth = By.name("DateOfBirthMonth");
    By _DobYear = By.name("DateOfBirthYear");

    LoadProp loadProp = new LoadProp();

    public void verifyUserIsOnRegisterPage(){
        Assert.assertTrue(driver.getCurrentUrl().contains(loadProp.getProperty("UserIsOnRegisterPageContains")));
    }
    public void userEntersRegistrationDetails(){

        //Type first name
        typeText(_firstName,loadProp.getProperty("FirstName"));
        //type second name
        typeText(_lastName,loadProp.getProperty("lastName"));
        //select date from dropdown
        selectByDropDownIndexValue(_DateOfBirthDay, loadProp.getProperty("DateOfBirthDay"));
        //Select selectDay = new Select(driver.findElement(By.name("DateOfBirthDay")));
        //selectDay.selectByVisibleText("15");
        //select month from dropdown
        selectByValue(_DateOfBirthMonth, loadProp.getProperty("DateOfBirthMonth"));
        //Select selectMonth = new Select(driver.findElement(By.name("DateOfBirthMonth")));
        //selectMonth.selectByValue("4");
        //select year from dropdown
        selectDropDownByVisibleText(_DobYear, loadProp.getProperty("Year"));
        //Select selectYear = new Select(driver.findElement(By.name("DateOfBirthYear")));
        //selectYear.selectByValue("1926");
        //Type email
        String email = loadProp.getProperty("emailPartOne")+ currentTimeStamp() + loadProp.getProperty("emailPartTwo");
        //String email = "Johnsmith+" + currentTimeStamp() + "@gmail.com";
        System.out.println(email);
        typeText(_email,(email));
        //wait
        waitForVisible(By.id("Newsletter"), 20);
        //click on Newsletter checkbox
        clickOnElement(By.id("Newsletter"));
        //Type password
        typeText(_password, loadProp.getProperty("Password"));
        //typeText(_password, "Test123!");
        //type confirm password
        typeText(_confirmPassword, loadProp.getProperty("ConfirmPassword"));
        //typeText(_confirmPassword, "Test123!");

    }
    public void clickOnRegisterButton(){
        //click on register button
        clickOnElement(_clickOnRegisterButton);
    }
}
