package com.saucedemo.stepdefinitions;

import com.saucedemo.pages.AddToCart;
import com.saucedemo.pages.DetailProduct;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class TestAddToCart {


    @Steps
    AddToCart addToCart;

    @Given("into to detail product or homepage")
    public void into_to_detail_product_or_homepage() {
        addToCart.intoDetailProduct();
    }
    @When("click buttoon add to cart")
    public void click_buttoon_add_to_cart() {
        addToCart.clickButtonAddCart();
    }
    @Then("verify of to cart item product")
    public void verify_of_to_cart_item_product() {
        Assert.assertEquals(addToCart.verifiedTitle(),"Sauce Labs Backpack");
        Assert.assertEquals(addToCart.verifiedPrice(),"29.99");
    }


}
