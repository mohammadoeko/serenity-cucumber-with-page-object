package com.saucedemo.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.By;

public class CheckoutProduct extends PageObject {

    public void btnCheckout() {
        WebElementFacade btnCheckout = $(".checkout_button");
        btnCheckout.click();
    }

    public void typeFirstname(String insertFirstname) {
        WebElementFacade firstname = $(By.id("first-name"));
        firstname.sendKeys(insertFirstname);
    }

    public void typeLastname(String insertLastname){
        WebElementFacade lastname = $(By.id("last-name"));
        lastname.sendKeys(insertLastname);
    }

    public void typePostalCode(String insertPostalCode) {
        WebElementFacade postalCode = $(By.id("postal-code"));
        postalCode.sendKeys(insertPostalCode);
    }

    public void btnContinue() {
        WebElementFacade btnContinue = $(".btn_primary");
        btnContinue.click();
    }

    public void btnFinish() {
        WebElementFacade btnFinish = $(".btn_action");
        btnFinish.click();
    }

    public String verifiedCheckout(){
        WebElementFacade txtThanksForOrder = $(".complete-header");
        return txtThanksForOrder.getText();
    }

    public void verifiedUrlCheckoutComplete(){
        String getUrlCompleteCheckkout = getDriver().getCurrentUrl();
        Assert.assertTrue(getUrlCompleteCheckkout.contains("checkout-complete"));
    }
}
