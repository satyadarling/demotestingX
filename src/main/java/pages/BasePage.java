package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait=new WebDriverWait(driver,Duration.ofSeconds(10));
    }
    

    public void click(By locator) {
    	wait.until(ExpectedConditions.presenceOfElementLocated(locator)).click();
        
    }

    public void enterText(By locator, String value) {
    	wait.until(ExpectedConditions.presenceOfElementLocated(locator)).clear();
        
    	wait.until(ExpectedConditions.presenceOfElementLocated(locator)).sendKeys(value);
    }

    public String getText(By locator) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(locator)).getText();
    }

    public boolean isDisplayed(By locator) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(locator)).isDisplayed();
    }
    public void moveToEle(By locator) {
    	//wait.until(ExpectedConditions.presenceOfElementLocated(locator)).click();
    	Actions action=new Actions(driver);
    	WebElement ele =wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    	action.moveToElement(ele).click().perform();
        
    }
    
}
