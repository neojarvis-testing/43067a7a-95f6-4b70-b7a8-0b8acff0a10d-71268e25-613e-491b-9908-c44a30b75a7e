package uistore;

import org.openqa.selenium.By;

public class ContactLocators {
    public static By viewPhone=By.xpath("(//a[@href='/about/contact/phone-directory'])[1]");
    public static By contactCleveland=By.cssSelector("h3[class='side-block__title lede']");
    public static By contactClevelandhome=By.xpath("(//a[@href='/'])[1]");
}
