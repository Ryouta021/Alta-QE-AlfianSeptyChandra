package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.example.pageObject.CartPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class CartSteps {
    private final WebDriver driver = Hooks.driver;
    CartPage cartPage = new CartPage(driver);
    @Then("User already on a cart page")
    public void verifyYourCartPage(){
        Assert.assertTrue(cartPage.yourcartDisplayed());
    }
    @When("User click remove {string}")
    public void clickButtonAddToCart(String barang) throws InterruptedException {
        cartPage.clicButtonRemoveCart(barang);
//        Thread.sleep(2000);
    }
    @And("User click checkout button")
    public void  clickCheckOutButton() throws InterruptedException {
        cartPage.clickButtonCheckout();
//        Thread.sleep(2000);
    }
    @When("User input {string} as firstName {string} as a lastName and input {string} as a postalCode")
    public void inputInformation(String firstname,String lastname,String postalcode) throws InterruptedException {
        cartPage.setFirstName(firstname);
        cartPage.setLastName(lastname);
        cartPage.setPostCode(postalcode);
        cartPage.clickContinueButton();
    }
}
