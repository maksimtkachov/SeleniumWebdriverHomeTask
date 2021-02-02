package Test;


import PageObjects.FormPage;
import PageObjects.ResultPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Test1 {
    public static FormPage inputPage;
    public static ResultPage resultPage;
    public static WebDriver driver;

    private String textForInput = "git config --global user.name  \"New Sheriff in Town\"\n" +
            "git reset $(git commit-tree HEAD^{tree} -m \"Legacy code\")\n" +
            "git push origin master --force";

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
        inputPage.inputNewPaste(textForInput, driver);
        inputPage.dropdownclick1("Bash", driver);
        inputPage.dropdownclick2("10 Minutes", driver);
        inputPage.inputNameTitle("how to gain dominance among developers", driver);
        inputPage.createButtonClick("Submit", driver);
        resultPage = new ResultPage();
        Assert.assertEquals(resultPage.getHeader(driver), "how to gain dominance among developers");
        Assert.assertEquals(resultPage.getData(driver), textForInput);
        Assert.assertEquals(resultPage.getHighlightingType(driver), "Bash");
    }

    @AfterTest
    public static void tearDown() {
        driver.quit();
    }
}




