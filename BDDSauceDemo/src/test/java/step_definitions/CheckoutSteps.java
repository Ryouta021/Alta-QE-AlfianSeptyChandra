package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.CheckoutPage;
import org.example.pageObject.HomePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class CheckoutSteps {
    private final WebDriver driver = Hooks.driver;
    CheckoutPage checkoutPage = new CheckoutPage(driver);

    @Then("User already in a checkout page and see the name of {string} as a produk")
    public void verifyCheckoutPage(String title){
        Assert.assertEquals(checkoutPage.getTitleName(),title);
    }
    @When("User click finsih button")
    public void clickFinishButton() throws InterruptedException {
        checkoutPage.clickFinishButton();
//       Thread.sleep(2000);
    }
    @Then("User will go to checkout complete page")
    public void verifyCheckoutCompletePage(){
        Assert.assertTrue(checkoutPage.checkoutCompleteDisplayed());
    }
    @When("User click back to home button")
    public void clickBackHomeButton(){
        checkoutPage.clickHomeButton();
    }


}
