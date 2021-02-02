package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResultPage {
    public String getHeader(WebDriver driver){
        WebElement header = driver.findElement(By.xpath("//div[@class='info-top']/h1"));
        return header.getText();
    }

    public String getData(WebDriver driver){
        WebElement header = driver.findElement(By.xpath("//textarea[@class='textarea']"));
        return header.getText();
    }

    public String getHighlightingType(WebDriver driver){
        WebElement header = driver.findElement(By.xpath("//div[@class='left']/a[contains(@class,'btn')]"));
        return header.getText();
    }
}
