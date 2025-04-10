package pages;

import uistore.PharmacyLocators;
import utils.Base;
import utils.WebDriverHelper;

public class PharmacyActions {
    WebDriverHelper driverHelper=new WebDriverHelper(Base.driver);
    public void takeSurvey(){
       
        driverHelper.scrollToElement(PharmacyLocators.takeSurveySpecila);
        //driverHelper.hover(PharmacyLocators.takeSurveySpecila);
      
        driverHelper.clickTheElement(PharmacyLocators.takeSurvey);
        driverHelper.switchWindow();
        Base.driver.navigate().back();

    }
}
