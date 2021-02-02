package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FormPage {


    public void inputNewPaste(String NewPaste, WebDriver driver) {
        WebElement NewPasteField = driver.findElement(By.xpath("//*[contains(@id,'postform-text')]"));
        NewPasteField.sendKeys(NewPaste);
    }

    public void dropdownclick(String DropdownValue, WebDriver driver) {
        WebElement expandDrp = driver.findElement(By.xpath("//*[contains(@class,'field-postform-expiration')]//b"));
        expandDrp.click();
        WebElement valueDrp = driver.findElement(By.xpath("//span[contains(@class,'select2-result')]//li[3]"));
        valueDrp.click();
    }

    public void inputNameTitle(String NameTitle, WebDriver driver) {
        WebElement NameTitleField = driver.findElement(By.xpath("//*[@id='postform-name']"));
        NameTitleField.sendKeys(NameTitle);


    }
}

