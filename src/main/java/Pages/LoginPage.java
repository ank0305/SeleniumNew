package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private WebDriver driver;

    //Locators
    private By emailInputLocator=  By.xpath("//input[@name='email']");
    private By  passwordInputLocator= By.xpath("//input[@name='password']");
    private By loginBtnLocator = By.xpath("//input[@type='submit']");
    private By logoutLinkLocator= By.linkText("Logout");
    //constructor

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    //method actions
    public void enterEmail(String email) {
        WebElement emailInput = driver.findElement(emailInputLocator);
        emailInput.sendKeys(email);
    }

    public void enterPassword(String password) {
        WebElement passwordInput = driver.findElement(passwordInputLocator);
        passwordInput.sendKeys(password);
    }

    public void loginBtn(){
        WebElement loginBtn = driver.findElement(loginBtnLocator);
        loginBtn.click();
    }


    public boolean checklogoutLink() {

       return driver.findElement(logoutLinkLocator).isDisplayed();

    }
}
