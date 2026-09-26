package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import utils.ConfigReader;
import utils.DriverFactory;

public class LoginSteps {

    WebDriver driver = DriverFactory.getDriver();
    LoginPage loginPage = new LoginPage(driver);

    @Given("I open the login page")
    public void openLoginPage() {
        String url = ConfigReader.getProperty("baseUrl");
        driver.get(url);
    }

    @When("I click login")
    public void clickLogin() {

        loginPage.clickLogin();
    }

    @Then("I should see the homepage")
    public void verifyHomepage() {

        System.out.println("Login successful");
    }

    @When("I click {string} button")
    public void i_click_button(String string) {
        loginPage.clickElement();
    }

}
