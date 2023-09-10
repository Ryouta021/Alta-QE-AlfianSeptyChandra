package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.HomePage;
import org.openqa.selenium.WebDriver;

public class HomeSteps {
    private final WebDriver driver = Hooks.driver;
    HomePage homePage = new HomePage(driver);

    @When("User filter list  product by {string}")
    public void selectFilterProduct(String filterProduct)   {
        homePage.selectFilterProduct(filterProduct);
    }
    @When("User click item {string}")
    public void clickButtonAddToCart(String item) throws InterruptedException {
        homePage.clickButtonAddToCart(item);
//        Thread.sleep(2000);
    }
    @And("User click cart")
        public void clickCartButton() throws InterruptedException {
        homePage.clickCart();
//        Thread.sleep(2000);
    }


}
