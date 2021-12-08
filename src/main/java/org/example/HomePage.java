package org.example;

import org.openqa.selenium.By;

public class HomePage extends Utils
{
public void clickOnRegisterButton(){
    clickOnElement(By.xpath("//a[@class='ico-register']"));
}
public void clickOnComputersMenu(){
    clickOnElement(By.xpath("//Div[@class='header-menu']/ul[1]/li[1]/a"));
}
public void clickOnNewsDetailsButton(){
    clickOnElement(By.xpath("//div[@class='news-items']/div[2]/div[3]/a[@href='/nopcommerce-new-release']"));
}
}
