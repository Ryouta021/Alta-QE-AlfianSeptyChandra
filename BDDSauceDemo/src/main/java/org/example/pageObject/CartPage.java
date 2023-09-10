package org.example.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
    public static WebDriver webDriver;

    public CartPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }
    @FindBy(xpath = "//span[@class='title']")
    private WebElement yourCart;
    @FindBy(xpath = "//button[@id='checkout']")
    private WebElement checkoutButton;
    @FindBy(id = "first-name")
    private WebElement firstName;
    @FindBy(id = "last-name")
    private  WebElement lastName;
    @FindBy(id = "postal-code")
    private  WebElement postCode;
    @FindBy(css = "#continue")
    private  WebElement continueButton;

    public boolean yourcartDisplayed(){
        return yourCart.isDisplayed();
    }

    public void clicButtonRemoveCart(String barang){
        String xpath = "//div[text()='" + barang + "']/ancestor::div[@class='cart_item']//button";
        webDriver.findElement(By.xpath(xpath)).click();
    }
    public void clickButtonCheckout(){
        checkoutButton.click();
    }

    public void setFirstName (String information){
        firstName.sendKeys(information);
    }
    public void setLastName (String information){
        lastName.sendKeys(information);
    }
    public void setPostCode (String information){
        postCode.sendKeys(information);
    }
    public void clickContinueButton(){
        continueButton.click();
    }

}
