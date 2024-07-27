package stepdefinition;

import Pages.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class LoginPageSteps {

private WebDriver driver;
private LoginPage loginPage;

@Before
    public void setup(){
    driver= new ChromeDriver();
    driver.manage().window().maximize();
}
@After
    public void tearDown(){
    if (driver!=null) {
        driver.quit();
    }
    }
@Given("I am on the Opencart Website")
    public void openzCartwebsite() {
    driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
    loginPage = new LoginPage(driver);
//testnew

}

@Given("I have entered valid username and password")
    public void I_have_entered_valid_username_and_password(){
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    loginPage.enterEmail("test@abc.comm");
    loginPage.enterPassword("Abc@123");
}
@When("I click on login button")
    public void loginBtnclick(){
    loginPage.loginBtn();
}

@Then("I should be able to login successfully")
    public void I_should_be_able_to_login_successfully(){
    Assert.assertTrue(loginPage.checklogoutLink());
}

}
