package org.example;

import org.example.pages.CheckOutPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CheckOutTests extends BaseTest {

    @Test
    public void checkTitleAboutPage() {
        loginPage.open();
        loginPage.loginAsStandardUser();
        checkOutPage.openCheckOutPage();
        Assert.assertEquals(checkOutPage.namePage(), "CHECKOUT: YOUR INFORMATION");
    }

    @Test
    public void checkFirstNameField() {
        loginPage.open();
        loginPage.loginAsStandardUser();
        checkOutPage.openCheckOutPage();
        Assert.assertTrue(checkOutPage.firstName());
    }

    @Test
    public void checkLastNameField() {
        loginPage.open();
        loginPage.loginAsStandardUser();
        checkOutPage.openCheckOutPage();
        Assert.assertTrue(checkOutPage.lastName());
    }

    @Test
    public void checkPostalCodeField() {
        loginPage.open();
        loginPage.loginAsStandardUser();
        checkOutPage.openCheckOutPage();
        Assert.assertTrue(checkOutPage.postalCode());
    }

    @Test
    public void checkContinueButton() {
        loginPage.open();
        loginPage.loginAsStandardUser();
        checkOutPage.openCheckOutPage();
        Assert.assertTrue(checkOutPage.continueButton());
    }

    @Test
    public void checkCancelButton() {
        loginPage.open();
        loginPage.loginAsStandardUser();
        checkOutPage.openCheckOutPage();
        Assert.assertTrue(checkOutPage.cancelButton());
    }
}
