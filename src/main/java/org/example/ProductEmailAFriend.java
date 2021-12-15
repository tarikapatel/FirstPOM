package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;

public class ProductEmailAFriend extends Utils{
By _FriendEmail = By.id("FriendEmail");
By _PersonalMessage = By.id("PersonalMessage");
By _sendemail = By.name("send-email");

    public void verifyUserIsOnProductEmailAFriendPage(){
        Assert.assertTrue(driver.getCurrentUrl().contains(loadProp.getProperty("UserIsOnProductEmailAFriendPageUrlContains")));
    }
    public void userEntersFriendsEmailAndMessage(){
        //Type friends email
        typeText(_FriendEmail, loadProp.getProperty("FriendsEmail"));
        // type personal message
        typeText(_PersonalMessage, loadProp.getProperty("SendPersonalMessage"));
    }

    public void clickOnSendEmailButton(){
        //User clicks on send email button
        clickOnElement(_sendemail);
    }

    public void verifyUserHasSuccessfullySentEmailToAFriend(){
        String actualMessageSentConfirmation = getTextFromElement(By.xpath("//div[@class='result']"));
        String expectedMessageSentConfirmation = loadProp.getProperty("expectedMessageSentConfirmation");
        assertEquals(actualMessageSentConfirmation,expectedMessageSentConfirmation);
    }
}
