package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LoginSteps {

    private final WebDriver driver = Hooks.driver;
    LoginPage loginPage = new LoginPage(driver);
    @When("User input {string} as userName {string} as a password")
    public void inputCredential(String user,String pass) throws InterruptedException {
        loginPage.setUserName(user);
        loginPage.setPassword(pass);
        loginPage.clickButtonLogin();
    }
    @Given("User already on a login page")
    public void verifyLoginPage(){
        Assert.assertTrue(loginPage.userNameDisplayed());
     }
     @Then("User already will go to product page")
    public void verifyproductpage (){
        Assert.assertTrue(loginPage.verifyLabelPage());
     }
     @Then("User sees error {string} on login page")
    public void verifyLabelErrorText(String errorText){
        Assert.assertEquals(loginPage.getLabelErrorText(),errorText);
     }
}
