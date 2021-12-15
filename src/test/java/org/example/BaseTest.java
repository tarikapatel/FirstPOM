package org.example;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static org.example.Utils.captureScreenshot;

public class BaseTest extends BrowserManager{

    BrowserManager browserManager = new BrowserManager();

    @BeforeMethod
    public void openBrowser(){
        browserManager.openBrowser();
    }

    @AfterMethod
    public void tearDownBrowser(ITestResult result){
            if (!result.isSuccess()){
                captureScreenshot(result.getName());
            }
            browserManager.closeBrowser();
    }
}
