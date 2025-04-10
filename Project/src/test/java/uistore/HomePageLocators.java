package uistore;

import org.openqa.selenium.By;

public class HomePageLocators {

    public static By healthLibrary=By.xpath("(//a[@href='/health'])[2]");
    public static By institueAndDepat=By.xpath("(//a[@href='/departments'])[2]");
    public static By needHelp=By.xpath("(//a[@class='nav--utility__link '])[2]");


    public static By clevelandClinicHeader = By.cssSelector("img[alt='Cleveland Clinic logo']");

    public static By facebookSocialLink = By.cssSelector("[href='https://www.facebook.com/ClevelandClinic']");
    public static By twitterSocialLink = By.cssSelector("[href='https://twitter.com/clevelandclinic']");
    public static By youtubeSocialLink = By.cssSelector("[href='https://www.youtube.com/user/clevelandclinic']");
    public static By instagramSocialLink = By.cssSelector("[href='https://www.instagram.com/clevelandclinic/']");
    public static By linkedinSocialLink = By.cssSelector("[href='https://www.linkedin.com/company/cleveland-clinic']");
    public static By pinterestSocialLink = By.cssSelector("[href='https://www.pinterest.com/clevelandclinic/']");
    public static By snapchatSocialLink = By.cssSelector("[href='https://www.snapchat.com/add/clevelandclinic']");
    
    
    public static By appointmentsActions = By.cssSelector("a[title='Appointments']");
    public static By acceptedInsuranceActions = By.cssSelector("a[title='Accepted Insurance']");
    public static By eventsCalenderActions = By.xpath("//a[text()='Events Calendar']");
    public static By financialAssistanceActions = By.xpath("//a[text()='Financial Assistance']");
    public static By giveClevelandActions = By.xpath("//a[text()='Give to Cleveland Clinic']");
    public static By payBillActions = By.cssSelector("a[title='Pay Your Bill']");
    public static By priceTransparencyActions = By.cssSelector("a[title='Price Transparency']");
    public static By referPatientActions = By.xpath("//a[text()='Refer a Patient']");
    public static By phoneDirectoryActions = By.xpath("//a[text()='Phone Directory']");
    public static By virtualOpinionsActions = By.xpath("//a[text()='Virtual Second Opinions']");
    public static By virtualVisitsActions = By.xpath("//a[text()='Virtual Visits']");
    

    public static By getDirection=By.cssSelector("div a.story-panel__button[href='/locations']");



}
