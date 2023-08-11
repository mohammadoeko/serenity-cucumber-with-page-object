package com.saucedemo.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

import java.util.List;

public class DetailProduct extends PageObject {

    LoginSaucedemo login;

    @Step
    public void dashboadPage() {
        login.openWeb();
        login.enterUsername("standard_user");
        login.enterPassword("secret_sauce");
        login.clickLogin();
    }

    @Step
    public void clickItemProduct() {
        WebElementFacade itemProduct = $(".inventory_item_name");
        itemProduct.click();

    }

    @Step
    public String verifiedDetailProduct() {
        WebElementFacade txtTitleDetailProdyct = $(".inventory_details_name");
        return txtTitleDetailProdyct.getText();
    }
}
