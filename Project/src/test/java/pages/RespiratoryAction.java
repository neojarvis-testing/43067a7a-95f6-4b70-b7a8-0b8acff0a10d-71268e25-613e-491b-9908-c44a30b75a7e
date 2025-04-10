package pages;

import uistore.RespiratoryLocators;
import utils.Base;

import utils.Screenshot;
import utils.WebDriverHelper;

public class RespiratoryAction {
    WebDriverHelper help = new WebDriverHelper(Base.driver);
public void respOperation() throws InterruptedException
{
   help.hoverAndClick(RespiratoryLocators.Introduction);
   String intro = Base.driver.getTitle();
   help.verifyTitle(intro);
   help.hoverAndClick(RespiratoryLocators.cough);
   String cough = Base.driver.getTitle();
    help.verifyTitle(cough);
//     Thread.sleep(2000);
//    help.hoverAndClick(RespiratoryLocators.pep);
//    String pep = Base.driver.getTitle();
//     help.verifyTitle(pep);
//     Thread.sleep(2000);
//    help.hoverAndClick(RespiratoryLocators.Acapella);
//    String acapella = Base.driver.getTitle();
//     help.verifyTitle(acapella);
//     Thread.sleep(2000);
//    help.hoverAndClick(RespiratoryLocators.nebulizer);
//    String nebulizer = Base.driver.getTitle();
//     help.verifyTitle(nebulizer);
//     Thread.sleep(2000);

}
public void doctorFilters() throws InterruptedException
{   Base.driver.navigate().back();
    Base.driver.navigate().back();
    Base.driver.navigate().back();
    // Base.driver.navigate().back();
    // Base.driver.navigate().back();
    help.hoverAndClick(RespiratoryLocators.byDoctors);
    help.hoverAndClick(RespiratoryLocators.specialist);
  
    help.hoverAndClick(RespiratoryLocators.male);
  
    help.hoverAndClick(RespiratoryLocators.female);
    String title = Base.driver.getTitle();
    help.verifyTitle(title);
   help.waitForClickability(RespiratoryLocators.mahamod, 2);
}
public void doctorSelect()
{
    help.hoverAndClick(RespiratoryLocators.mahamod);
    help.switchWindow();
    String url = Base.driver.getCurrentUrl();
    help.verifyUrl(url);
    help.retrieveText(RespiratoryLocators.doctorInfo);
    Screenshot.screenShotAndHighlight(Base.driver,RespiratoryLocators.doctorInfo,"Doctor's profile");
}
public void respiratoryAll() throws InterruptedException
{
    respOperation();
    doctorFilters();
    doctorSelect();
}
}
