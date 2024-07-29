package Utils;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CommonUtils {


    public WebDriver driver;


    public void navigateToURL(String URL) {

        System.out.println("Navigating to" + URL);
        driver.navigate().to(URL);

    }

    public void sendKeys(By Selector, String value) {
        WebElement element = driver.findElement(Selector);
        element.sendKeys(value);
    }

    public String explicitWait(String item) {
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement element = wait.until(
                ExpectedConditions.elementToBeClickable(By.id(item)));
        return item;

    }

    public void implicitWait() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    }

    public void alertAccept(String alert){
        WebElement element= driver.findElement(By.xpath(alert));
        element.click();
        driver.switchTo().alert().dismiss();
        driver.navigate().refresh();
        WebElement iframe= driver.findElement(By.cssSelector(""));
        driver.switchTo().frame(iframe);

        WebElement clickable = driver.findElement(By.cssSelector(""));
        new Actions(driver)
                .moveToElement(clickable)
                .pause(Duration.ofSeconds(2))
                .clickAndHold()
                .sendKeys("Sbc")
                .perform();

    }
}