package com.saucedemo.stepdefinitions;

import com.saucedemo.pages.DetailProduct;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class TestDetailProduct {

    @Steps
    DetailProduct detailProduct;
    @Given("into to dashboard")
    public void into_to_dashboard() {
        detailProduct.dashboadPage();
    }
    @When("click item product")
    public void click_item_product() {
        detailProduct.clickItemProduct();
    }
    @Then("should be display detail of product")
    public void should_be_display_detail_of_product() {
        Assert.assertEquals(detailProduct.verifiedDetailProduct(),"Sauce Labs Backpack");
    }

}
