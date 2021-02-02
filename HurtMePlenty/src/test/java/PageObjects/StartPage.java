package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StartPage {
    WebDriver driver;

    public StartPage(WebDriver driver){
        this.driver = driver;
    }

    public SearchResultPage searchInput(String searchText) {
        WebElement searchButton = driver.findElement(By.xpath("//*[contains(@class,'devsite-search-container')]"));
        searchButton.click();
        WebElement inputSeachField = driver.findElement(By.xpath("//input[contains(@class,'devsite-search-field')]"));
        inputSeachField.sendKeys(searchText + "\n");
        return new SearchResultPage(driver);
    }
}
