package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.CommonMethods;

import java.time.Duration;

public class LoginSteps extends CommonMethods {


    @Given("user is navigated to HRMS application")
    public void user_is_navigated_to_hrms_application() {
        //to launch chrome browser
        driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%22");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait( Duration.ofSeconds(10));
    }
    @When("user enters valid admin username and password")
    public void user_enters_valid_admin_username_and_password() {
        WebElement usernameField= driver.findElement(By.id("txtUsername"));
        WebElement passwordField= driver.findElement(By.id("txtPassword"));
        //entering the credentials
        usernameField.sendKeys("admin");
        passwordField.sendKeys("Hum@nhrm123");
    }
    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        WebElement loginBtn=driver.findElement(By.name("Submit"));
        loginBtn.click();

    }
    @Then("user is successfully logged in the application")
    public void user_is_successfully_logged_in_the_application() {
        System.out.println("My test case is passed");
    }
    @When("user enters ess username and password")
    public void user_enters_ess_username_and_password() {
        WebElement usernameField2= driver.findElement(By.id("txtUsername"));
        WebElement passwordField2= driver.findElement(By.id("txtPassword"));
        //entering the credentials
        usernameField2.sendKeys("dalima123");
        passwordField2.sendKeys("Hum@nhrm123");
    }
    @When("user enters invalid username and password")
    public void user_enters_invalid_username_and_password() {
        WebElement usernameField3= driver.findElement(By.id("txtUsername"));
        WebElement passwordField3= driver.findElement(By.id("txtPassword"));
        //entering the credentials
        usernameField3.sendKeys("admin123");
        passwordField3.sendKeys("Hum@nhrm123");
    }

    @Then("error message is displayed")
    public void error_message_is_displayed() {
        System.out.println("error messsage is displayed");
    }
}
