package Test;

import PageObjects.PricingCalculatorPage;
import PageObjects.SearchResultPage;
import PageObjects.StartPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Test1 {

    public static StartPage startPage;
    public static WebDriver driver;

    @BeforeTest
    public static void setup() {
        driver = new ChromeDriver();
        driver.get("https://cloud.google.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void newpasteTest() {
        startPage = new StartPage(driver);
        SearchResultPage resultPage = startPage.searchInput("Google Cloud Platform Pricing Calculator");
        PricingCalculatorPage calcPage = resultPage.searchInput("Google Cloud Platform Pricing Calculator");
        calcPage.enterNumberOfInst(4);
        calcPage.selectFrankfurt();
        calcPage.estimate();
    }

    @AfterTest
    public static void tearDown() {
        driver.quit();
    }
}
