package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.print.attribute.standard.Fidelity;

public class CheckoutPage {
    public static WebDriver webDriver;

    public CheckoutPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }
    @FindBy(xpath = "//div[@class='inventory_item_name']")
    private WebElement itemName;
    @FindBy(id = "finish")
    private WebElement buttonFinish;
    @FindBy(id = "back-to-products")
    private WebElement backHomeButton;
    @FindBy(xpath = "//span[@class='title']")
    private WebElement checkoutComplete;

    public String getTitleName(){
        return itemName.getText();
    }
    public void clickFinishButton(){
        buttonFinish.click();
    }
    public void clickHomeButton(){
        backHomeButton.click();
    }
    public boolean checkoutCompleteDisplayed(){
        return checkoutComplete.isDisplayed();
    }


}
