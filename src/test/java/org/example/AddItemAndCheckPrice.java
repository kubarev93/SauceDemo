package org.example;

import org.example.pages.CartPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddItemAndCheckPrice extends BaseTest {

    @Test
    public void checkItemName() {
        loginPage.open();
        loginPage.loginAsStandardUser();
        productsPage.addToCart("Sauce Labs Backpack");
        headerPage.openCart();
        Assert.assertEquals(driver.findElement(By.xpath("//div[@class='inventory_item_name']")).getText(), "Sauce Labs Backpack");
    }

    @Test
    public void checkItemPrice() {
        loginPage.open();
        loginPage.loginAsStandardUser();
        productsPage.addToCart("Sauce Labs Backpack");
        String price = driver.findElement(By.xpath("//div[@class='inventory_item_price']")).getText();
        headerPage.openCart();
        Assert.assertEquals(driver.findElement(By.xpath("//div[@class='inventory_item_price']")).getText(), price);
    }
}