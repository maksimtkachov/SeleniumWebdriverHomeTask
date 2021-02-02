package Test;


import PageObjects.FormPage;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Test1 {
    public static FormPage inputPage;
    public static WebDriver driver;


    @BeforeTest
    public static void setup() {
        driver = new ChromeDriver();
        driver.get("https://pastebin.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void newpasteTest() {

        inputPage = new FormPage();
        inputPage.inputNewPaste("Hello from WebDriver", driver);
        inputPage.dropdownclick("10M", driver);
        inputPage.inputNameTitle("helloweb", driver);
    }

    @AfterTest
    public static void tearDown() {
        driver.quit();
    }

}




