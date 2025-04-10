package pages;

import uistore.HomePageLocators;
import utils.Base;
import utils.WebDriverHelper;

public class HomePageActions {
    WebDriverHelper helper=new WebDriverHelper(Base.driver);
    public void healthLibrary(){
        helper.clickTheElement(HomePageLocators.healthLibrary);
    }
    public void institute(){
        helper.clickTheElement(HomePageLocators.institueAndDepat);
    }
}
