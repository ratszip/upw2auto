package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BaseTest {
    public WebDriver driver;

    @BeforeMethod
    public void setUp() {
        //1. Open browser and open test url
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://jinshuju.com");
    }

    @AfterMethod
    public void quiteBrowser() {
        //3. Quite browser
        driver.quit();
    }
}