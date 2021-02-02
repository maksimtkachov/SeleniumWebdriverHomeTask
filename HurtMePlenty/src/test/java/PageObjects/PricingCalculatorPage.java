package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class PricingCalculatorPage {
    WebDriver driver;

    public PricingCalculatorPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterNumberOfInst(int number) {
        driver.switchTo().frame(driver.findElement(By.xpath("//devsite-iframe/iframe")));
        driver.switchTo().frame(driver.findElement(By.id("myFrame")));
        WebElement numberOfInstancesInput = driver.findElement(By.xpath("//input[@id='input_63']"));
        numberOfInstancesInput.sendKeys(String.valueOf(number));
    }

    public void selectFrankfurt() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement expandDrp = driver.findElement(By.xpath("//*[@id='select_value_label_61']"));
        expandDrp.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement valueDrp = driver.findElement(By.xpath("//*[@id='select_option_205']/div[1]"));
        valueDrp.click();
    }

    public void estimate() {
        WebElement estimationButton = driver.findElement(By.xpath("//md-card-content//div[1]/form/div[13]/button[contains(.,'Add to Estimate')]"));
        ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,200);");
        estimationButton.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
