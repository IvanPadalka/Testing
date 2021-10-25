package businessObjects;

import driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.NoSuchElementException;

public class AbstractPageBO {

    public static WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), 10);

    public void proceedToPage(final String url){
        DriverFactory.getDriver().get(url);
    }

    WebElement getElement(By locator){
        WebElement webElement = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return webElement;
    }

    public boolean isDisplayed(By locator){
        try{
            return getElement(locator).isDisplayed();
        }catch (NoSuchElementException | TimeoutException e){
            return false;
        }
    }

}
