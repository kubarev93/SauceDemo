package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage extends BasePage {
    public CheckOutPage(WebDriver driver) {
        super(driver);
    }
//    private final By NAME_OF_PAGE = By.xpath("//div[@class=\"header_secondary_container\"]");
//    private final By FIRST_NAME = By.id("first-name");
//    private final By LAST_NAME = By.id("last-name");
//    private final By POSTAL_CODE = By.id("postal-code");
//    private final By CONTINUE_BUTTON = By.id("continue");
//    private final By CANCEL_BUTTON = By.id("cancel");

    public String namePage () {
        return driver.findElement(By.xpath("//div[@class=\"header_secondary_container\"]")).getText();
    }

    public boolean firstName () {
        return driver.findElement(By.id("first-name")).isDisplayed();
    }
    public boolean lastName () {
        return driver.findElement(By.id("last-name")).isDisplayed();
    }
    public boolean postalCode () {
        return driver.findElement(By.id("postal-code")).isDisplayed();
    }
    public boolean continueButton () {
        return driver.findElement(By.id("continue")).isDisplayed();
    }
    public boolean cancelButton () {
        return driver.findElement(By.id("cancel")).isDisplayed();
    }



    public void openCheckOutPage() {
        driver.get(BASE_URL + "checkout-step-one.html");
    }


}
