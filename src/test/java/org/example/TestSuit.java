package org.example;

import org.testng.annotations.Test;

public class TestSuit extends BaseTest{
HomePage homePage = new HomePage();
RegistrationPage registrationPage = new RegistrationPage();
RegistrationResultPage registrationResultPage = new RegistrationResultPage();
ComputersPage computersPage = new ComputersPage();
DesktopPage desktopPage = new DesktopPage();
NewReleasePage newReleasePage = new NewReleasePage();
BuildYourOwnComputer buildYourOwnComputer = new BuildYourOwnComputer();
ProductEmailAFriend productEmailAFriend = new ProductEmailAFriend();
@Test
    public void verifyUserIsAbleToRegisterSuccessfully(){
        //click on register button
        homePage.clickOnRegisterButton();
        // verify user is on registration page
        registrationPage.verifyUserIsOnRegisterPage();
        // Type User Details
        registrationPage.userEntersRegistrationDetails();
        // click on register button
        registrationPage.clickOnRegisterButton();
        //verify user is on register Successful page
        registrationResultPage.verifyUserIsOnRegisterSuccessPage();
        //Verify user has successfully registered
        registrationResultPage.verifyUserHasSuccessfullyRegistered();
    }
    @Test
    public void verifyUserIsAbleToNavigateToDesktopPage(){
    //click on Computer Menu
    homePage.clickOnComputersMenu();
    //verify user is on Computers Menu page
    computersPage.verifyUserIsOnComputerPage();
    //click on desktop menu
    computersPage.clickOnDesktopsMenu();
    //verify user is on desktop page
    desktopPage.verifyUserIsOnDesktopPage();
    //Verify user is shown desktops menu
    desktopPage.verifyUserIsShownDesktopMenu();
    }

    @Test
    public void verifyNewsCommentIsSuccessfullyAdded(){
    //click on News Details
    homePage.clickOnNewsDetailsButton();
    //Verify user is on news release Page
    newReleasePage.verifyUserIsOnNewReleasePage();
    //Type title and comment
    newReleasePage.userEnterCommentDetails();
    //click on New Comment Button
    newReleasePage.clickOnNewCommentButton();
    //verify user has successfully added the comment.
    newReleasePage.userHasAddedNewCommentSuccessfully();
    }
    @Test
    public void verifyUserIsAbleToReferAProductToAFriend(){
    //verify user is successfully registered
    verifyUserIsAbleToRegisterSuccessfully();
    //verify user has successfully navigated to Desktop page
    verifyUserIsAbleToNavigateToDesktopPage();
    //Click on Build Your Own Computer
    desktopPage.clickOnBuildYourOwnComputer();
    //click on Email a Friend button
    buildYourOwnComputer.clickOnEmailAFriend();
    // verify user is on email a friend page
    productEmailAFriend.verifyUserIsOnProductEmailAFriendPage();
    //Type user friends email and personal message
    productEmailAFriend.userEntersFriendsEmailAndMessage();
    //click Send email button
    productEmailAFriend.clickOnSendEmailButton();
    //verify user has successfully sent the email
    productEmailAFriend.verifyUserHasSuccessfullySentEmailToAFriend();
    }
}