import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Helper {

    private WebDriver driver = BrowserSetup.driver;
    WebDriverWait wait = new WebDriverWait(driver,10);
    public void waitUntilElementVisible(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitUntilElementVisible(WebElement element, int timeoutSeconds){
        wait = new WebDriverWait(driver,timeoutSeconds);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
