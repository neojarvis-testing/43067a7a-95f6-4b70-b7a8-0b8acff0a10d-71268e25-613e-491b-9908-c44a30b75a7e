package utils;
 
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.TimeZone;
 
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
 
public class ReportHelper extends Base{
    private static Properties config;
    private static ExtentReports reportManager;
 
    /*
     * a. Method Name: initializeReport
     * b. Author Name: Vinny
     * c. Description: This method is used to initialize report creation.
     * d. Parameters: None
     * e. Return type: ExtentReports
     */
    public static ExtentReports initializeReport() {
        return initializeReport(null);
    }
 
    /*
     * a. Method Name: initializeReport
     * b. Author Name: Vinny
     * c. Description: This method is used to initialize report creation with a custom report name.
     * d. Parameters: String customReportName
     * e. Return type: ExtentReports
     */
    public static ExtentReports initializeReport(String customReportName) {
        if (reportManager == null) {
            reportManager = setupReport(customReportName);
        }
        return reportManager;
    }
 
    /*
     * a. Method Name: setupReport
     * b. Author Name: Vinny
     * c. Description: This method is used to generate and store reports in the filepath with a date.
     * d. Parameters: String customReportName
     * e. Return type: ExtentReports
     */
    private static ExtentReports setupReport(String customReportName) {
        ExtentReports report = new ExtentReports();
 
        // Load configuration properties
        String configPath = System.getProperty("user.dir") + "/config/browser.properties";
        try {
            FileInputStream configFile = new FileInputStream(configPath);
            config = new Properties();
            config.load(configFile);
        } catch (IOException ex) {
            System.out.println("Failed to load config file: " + ex.getLocalizedMessage());
        }
 
        // Create timestamp for unique report name
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss");
        TimeZone timezone = TimeZone.getTimeZone("Asia/Kolkata"); // IST timezone
        formatter.setTimeZone(timezone);
        String timeIdentifier = formatter.format(new Date());
 
        // Construct the file path for the report
        String reportPath = System.getProperty("user.dir") + "/output/reports/";
        if (customReportName == null || customReportName.isEmpty()) {
            customReportName = "Default_TestReport";
        }
        reportPath += customReportName + "_" + timeIdentifier + ".html";
 
        File reportFile = new File(reportPath);
 
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter(reportFile);
 
        sparkReporter.config().setTheme(Theme.DARK);
        sparkReporter.config().setReportName("Custom Test Report");
        sparkReporter.config().setDocumentTitle("Automation Test Report");
        sparkReporter.config().setTimeStampFormat("dd/MM/yyyy hh:mm:ss");
 
        report.attachReporter(sparkReporter);
 
        report.setSystemInfo("Application URL", config.getProperty("appUrl"));
        report.setSystemInfo("Browser", config.getProperty("browserType"));
        report.setSystemInfo("Test User", config.getProperty("username"));
        report.setSystemInfo("OS", System.getProperty("os.name"));
        report.setSystemInfo("Machine User", System.getProperty("user.name"));
        report.setSystemInfo("Java Version", System.getProperty("java.version"));
        return report;
    }
 
    /*
     * a. Method Name: addScreenshotToReport
     * b. Author Name: Vinny
     * c. Description: This method highlights an element, captures a screenshot, and attaches it to the test report.
     * d. Parameters: ExtentTest testCase, WebDriver driver, By locator, String filename
     * e. Return type: void
     */
    public static void addScreenshotToReport(ExtentTest testCase, WebDriver driver, By locator, String filename) {
        try {
            // Call the Screenshot utility to highlight the element and capture the screenshot
            Screenshot.screenShotAndHighlight(driver, locator, filename);
 
            // Define the screenshot path
            String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
            String screenshotPath = System.getProperty("user.dir") + "/screenshots/" + filename + "_" + timestamp + ".png";
 
            // Attach the screenshot to the report
            testCase.addScreenCaptureFromPath(screenshotPath);
        } catch (Exception e) {
            System.err.println("Error during screenshot capture: " + e.getMessage());
        }
    }
}