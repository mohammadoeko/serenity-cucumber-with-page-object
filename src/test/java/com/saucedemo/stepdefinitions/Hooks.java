package com.saucedemo.stepdefinitions;

import org.junit.After;
import org.junit.Before;

public class Hooks {

    @Before
    public void beforeScenario() {
        System.out.println("before scenario");
    }

    @After
    public void afterScenario() {
        System.out.println("after scenario");
    }
}
