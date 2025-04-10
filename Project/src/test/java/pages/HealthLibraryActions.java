package pages;



import uistore.HealthLibraryLocators;
import utils.Base;
import utils.WebDriverHelper;

public class HealthLibraryActions {
    WebDriverHelper helper=new WebDriverHelper(Base.driver);
    public void clickOnEyes(){
        helper.scrollToElementandCLick(HealthLibraryLocators.bodySysAndOrgans);
        helper.waitForVisibility(HealthLibraryLocators.searchBar,10);
        helper.typeText(HealthLibraryLocators.searchBar,"Eyes");
        helper.pressEnter(HealthLibraryLocators.searchBar);
        helper.clickTheElement(HealthLibraryLocators.eyes);
    }
}
