package com.saucedemo.stepdefinitions;

import com.saucedemo.pages.AddToCart;
import com.saucedemo.pages.CheckoutProduct;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class TestCheckout {

    AddToCart addToCart;

    @Steps
    CheckoutProduct checkout;

    @Given("Have one or more product in cart page")
    public void have_one_or_more_product_in_cart_page() {
        addToCart.intoDetailProduct();
        addToCart.clickButtonAddCart();
    }
    @When("Click button checkout")
    public void click_button_checkout() {
        checkout.btnCheckout();
    }
    @And("type firstname")
    public void type_firstname() {
        checkout.typeFirstname("Mohammad");
    }
    @And("type lastname")
    public void type_lastname() {
        checkout.typeLastname("Irvan");
    }
    @And("type postal code")
    public void type_postal_code() {
        checkout.typePostalCode("78473");
    }
    @And("click button continue")
    public void click_button_continue() {
        checkout.btnContinue();
    }
    @And("click button finish")
    public void click_button_finish() {
        checkout.btnFinish();
    }
    @Then("should be display message thanks for your order")
    public void should_be_display_message_thanks_for_your_order() {
        Assert.assertEquals(checkout.verifiedCheckout(),"THANK YOU FOR YOUR ORDER");
        checkout.verifiedUrlCheckoutComplete();
    }
}
