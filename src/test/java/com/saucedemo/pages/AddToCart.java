package com.saucedemo.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

public class AddToCart extends PageObject {

    DetailProduct detailProduct;

    public void intoDetailProduct() {
        detailProduct.dashboadPage();
        detailProduct.clickItemProduct();
    }

    public void clickButtonAddCart() {
        WebElementFacade btnAddCart = $(".btn_primary");
        btnAddCart.click();

        WebElementFacade iconCart = $(By.id("shopping_cart_container"));
        iconCart.click();
    }

    public String verifiedTitle() {
        WebElementFacade txtTitle = $(".inventory_item_name");
        return txtTitle.getText();
    }

    public String verifiedPrice() {
        WebElementFacade txtPrice = $(".inventory_item_price");
        return txtPrice.getText();
    }

}
