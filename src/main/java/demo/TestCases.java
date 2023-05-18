package demo;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
//Selenium Imports
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
///

public class TestCases {
    ChromeDriver driver;

    public TestCases() {
        System.out.println("Constructor: TestCases");
        WebDriverManager.chromedriver().timeout(30).setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    public void endTest() {
        System.out.println("End Test: TestCases");
        driver.close();
        driver.quit();

    }

    public void testCase01() {
        System.out.println("Start Test case: testCase01");
        driver.get("https://www.google.com");
        System.out.println("end Test case: testCase02");
    }

    public void testCase02() {
        // Navigate to URL
        driver.get("https://www.google.com/");
        // Click on search bar using name "q"
        driver.findElementByName("q").click();
        // type in "amazon" in search bar using locator name "q"
        driver.findElementByName("q").sendKeys("amazon");
        // click on google search using locator XPath "(//input[@value='Google Search'])[1]"
        driver.findElementByName("q").sendKeys(Keys.ENTER);
        // driver.findElementByXPath("(//input[@value='Google Search'])[1]");
        // validate if search results is returning using xpath
        final boolean isDisplyed = driver.findElementByXPath("//h3[text()='Amazon.in']").isDisplayed();
        System.out.println(isDisplyed);
    }

    public <WebElement> void testCase03() {
        // Navigate to the URL
        driver.get("https://in.bookmyshow.com/explore/home/chennai");
        // Get all the elements with tag name "a"
        List<org.openqa.selenium.WebElement> hyperlinks = driver.findElementsByTagName("a");
        // Count the number of hyperlinks
        int hyperlinkCount = hyperlinks.size();
        // Print the count of hyperlinks
        System.out.println("Number of hyperlinks: " + hyperlinkCount);
        
    }

    public void testCase04() {
        
    }
}
