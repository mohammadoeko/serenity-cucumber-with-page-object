package com.saucedemo.stepdefinitions;

import com.saucedemo.pages.LoginSaucedemo;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class TestLogin {

    @Steps
    LoginSaucedemo login;

    @Given("open web saucedemo")
    public void open_web_saucedemo() {
        login.openWeb();
    }
    @When("enter username")
    public void enter_username() {
        login.enterUsername("standard_user");
    }
    @And("enter password")
    public void enter_password() {
        login.enterPassword("secret_sauce");
    }
    @And("Click Login")
    public void click_login() {
        login.clickLogin();
    }
    @Then("should be display dashboard")
    public void should_be_display_dashboard() {
        Assert.assertEquals(login.verifiedLogin(),"Products");
    }

}
