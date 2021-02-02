package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResultPage {
    WebDriver driver;

    public SearchResultPage(WebDriver driver) {
        this.driver = driver;
    }

    public PricingCalculatorPage searchInput(String titleLink) {
        WebElement expectedTitle = driver.findElement(By.xpath(String.format("//div[@class='gsc-thumbnail-inside']//b[contains(.,'%s')]", titleLink)));
        expectedTitle.click();
        return new PricingCalculatorPage(driver);
    }
}
