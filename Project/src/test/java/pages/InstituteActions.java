package pages;

import uistore.ContactLocators;
import uistore.InstituteLocators;
import utils.Base;
import utils.WebDriverHelper;

public class InstituteActions {
    WebDriverHelper helper=new WebDriverHelper(Base.driver);
    public void bloodacction(){
        helper.hover(InstituteLocators.specilaSelect);
        helper.waitsec(2);
        helper.clickTheElement(InstituteLocators.bloodManagement);

    }
    public void pharmacyAction(){
        // helper.waitsec(3);
        // helper.scrollpixel(700);
        helper.hover(InstituteLocators.specilaSelect);
        helper.waitsec(2);
        helper.clickTheElement(InstituteLocators.pharmacy);
        
    }
    public void contactAction(){
        helper.scrollpixel(500);
        helper.hover(InstituteLocators.specilaSelectcontact);
        helper.waitForClickability(InstituteLocators.contact, 3);
        helper.clickTheElement(InstituteLocators.contact);
        helper.waitsec(3);
        helper.scrollpixel(600);
        helper.clickTheElement(ContactLocators.viewPhone);
         helper.clickTheElement(ContactLocators.contactCleveland);
         helper.clickTheElement(ContactLocators.contactClevelandhome);

    }
    
}
