package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;

public class ProductEmailAFriend extends Utils{
By _FriendEmail = By.id("FriendEmail");
By _PersonalMessage = By.id("PersonalMessage");

    public void verifyUserIsOnProductEmailAFriendPage(){
        Assert.assertTrue(driver.getCurrentUrl().contains("productemailafriend/1"));
    }
    public void userEntersFriendsEmailAndMessage(){
        //Type friends email
        typeText(_FriendEmail, "johnsmith999@gmail.com");
        // type personal message
        typeText(_PersonalMessage, "I refer this product to you.");
    }

    public void clickOnSendEmailButton(){
        //User clicks on send email button
        clickOnElement(By.name("send-email"));
    }

    public void verifyUserHasSuccessfullySentEmailToAFriend(){
        String actualMessageSentConfirmation = getTextFromElement(By.xpath("//div[@class='result']"));
        String expectedMessageSentConfirmation = "Your message has been sent.";
        assertEquals(actualMessageSentConfirmation,expectedMessageSentConfirmation);
    }
}
