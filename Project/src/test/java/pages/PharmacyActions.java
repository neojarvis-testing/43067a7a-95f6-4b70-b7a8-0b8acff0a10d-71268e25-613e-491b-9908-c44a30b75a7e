package pages;

import uistore.PharmacyLocators;
import utils.Base;
import utils.WebDriverHelper;

public class PharmacyActions {
    WebDriverHelper helper=new WebDriverHelper(Base.driver);
    public void takeSurvey(){
        helper.waitsec(3);
        helper.scrollpixel(700);
        helper.scrollToElement(PharmacyLocators.takeSurveySpecila);
        //helper.hover(PharmacyLocators.takeSurveySpecila);
        helper.waitsec(3);
        helper.clickTheElement(PharmacyLocators.takeSurvey);
        helper.switchWindow();
        Base.driver.navigate().back();

    }
}
