package org.example;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends BrowserManager{

    BrowserManager browserManager = new BrowserManager();

    @BeforeMethod

    public void openBrowser(){
        browserManager.openBrowser();
    }
    @AfterMethod

    public void tearDownBrowser(){
        browserManager.closeBrowser();
    }
}
