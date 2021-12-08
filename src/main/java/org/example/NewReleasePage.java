package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;

public class NewReleasePage extends Utils{
    public void verifyUserIsOnNewReleasePage(){
        Assert.assertTrue(driver.getCurrentUrl().contains("nopcommerce-new-release"));
    }
    public void userEnterCommentDetails(){
        //type title
        typeText(By.id("AddNewComment_CommentTitle"),"Review");
        //type Comment
        typeText(By.id("AddNewComment_CommentText"),"Good Experience");
        //wait for new comment button is recognised
        waitForClickable(By.xpath("//button[@class='button-1 news-item-add-comment-button']"), 20);
    }
    public void clickOnNewCommentButton(){
        //wait for new comment button is recognised
        waitForClickable(By.xpath("//button[@class='button-1 news-item-add-comment-button']"), 20);
        //click on New Comment button
        clickOnElement(By.xpath("//button[@class='button-1 news-item-add-comment-button']"));
    }
    public void userHasAddedNewCommentSuccessfully(){
        String actualSuccessCommentMessage = getTextFromElement(By.xpath("//div[@class='result']"));
        String expectedSuccessCommentMessage = "News comment is successfully added.";
        assertEquals(actualSuccessCommentMessage,expectedSuccessCommentMessage);
    }
}
