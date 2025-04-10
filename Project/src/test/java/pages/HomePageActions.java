package pages;

import com.aventstack.extentreports.ExtentTest;


import uistore.HomePageLocators;

import utils.Base;

import utils.WebDriverHelper;

public class HomePageActions {
WebDriverHelper help = new WebDriverHelper(Base.driver);

 ExtentTest test;
public void searchOperation() throws Exception
{
    help.clickTheElement(HomePageLocators.search);
    help.clickTheElement(HomePageLocators.searchbar);
    help.typeText(HomePageLocators.searchbar, "Respiratory");
   
    help.pressEnter(HomePageLocators.searchbar);
    String title = Base.driver.getTitle();
    help.verifyTitle(title);
    
    help.waitForClickability(HomePageLocators.firstResp, 2);
     help.clickTheElement(HomePageLocators.firstResp);
     help.retrieveText(HomePageLocators.verifyResp);
}
public void searchAll() throws Exception
{
    searchOperation();
}
}
