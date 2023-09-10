package org.example.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
    public static WebDriver webDriver;

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }
    @FindBy(xpath = "//select[@class='product_sort_container']")
    private WebElement filterProduct;

    @FindBy(xpath = "//span[@class='shopping_cart_badge']")
    private  WebElement clickcart;
    public void selectFilterProduct(String filterProduk){
        Select filter = new Select(filterProduct);
        filter.selectByVisibleText(filterProduk);
    }
    public void clickButtonAddToCart(String item){
        String xpath = "//div[text()='" + item + "']/ancestor::div[@class='inventory_item']//button";
        webDriver.findElement(By.xpath(xpath)).click();
    }
    public void clickCart(){
        clickcart.click();
    }
}
