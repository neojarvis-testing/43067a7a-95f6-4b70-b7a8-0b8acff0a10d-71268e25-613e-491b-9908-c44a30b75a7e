package pages;

import uistore.ContactLocators;
import uistore.InstituteLocators;
import utils.Base;
import utils.WebDriverHelper;

public class InstituteActions {
    WebDriverHelper driverHelper=new WebDriverHelper(Base.driver);
    public void bloodacction(){
        driverHelper.hover(InstituteLocators.specilaSelect);
        
        driverHelper.clickTheElement(InstituteLocators.bloodManagement);

    }
    public void pharmacyAction(){
        // driverHelper.waitsec(3);
        // driverHelper.scrollpixel(700);
        driverHelper.hover(InstituteLocators.specilaSelect);
        
        driverHelper.clickTheElement(InstituteLocators.pharmacy);
        
    }
    public void contactAction(){
       
        driverHelper.hover(InstituteLocators.specilaSelectcontact);
        driverHelper.waitForClickability(InstituteLocators.contact, 3);
        driverHelper.clickTheElement(InstituteLocators.contact);
       
       
        driverHelper.clickTheElement(ContactLocators.viewPhone);
         driverHelper.clickTheElement(ContactLocators.contactCleveland);
         driverHelper.clickTheElement(ContactLocators.contactClevelandhome);

    }
    
}
