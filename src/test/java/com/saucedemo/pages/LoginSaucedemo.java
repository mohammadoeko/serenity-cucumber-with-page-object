package com.saucedemo.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class LoginSaucedemo extends PageObject {

    @Step
    public void openWeb() {
        getDriver().get("https://www.saucedemo.com/v1/index.html");
    }

    @Step
    public void enterUsername(String inputUsername) {
        WebElementFacade username = $(By.id("user-name"));
        username.sendKeys(inputUsername);
    }

    @Step
    public void enterPassword(String inputPassword) {
        WebElementFacade password = $(By.id("password"));
        password.sendKeys(inputPassword);
    }

    @Step
    public void clickLogin() {
        WebElementFacade clickLogin = $(By.id("login-button"));
        clickLogin.click();
    }

    @Step
    public String verifiedLogin() {
        WebElementFacade txtProduct = $(".product_label");
        return txtProduct.getText();
    }
}
