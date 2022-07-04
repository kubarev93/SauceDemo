package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddItem extends BaseTest {
//test12
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
        headerPage.openCart();
        Assert.assertEquals(driver.findElement(By.xpath("//div[@class='inventory_item_price']")).getText(), "$29.99");
    }
}
