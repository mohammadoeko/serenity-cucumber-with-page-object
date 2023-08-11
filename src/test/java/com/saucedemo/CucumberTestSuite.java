package com.saucedemo;

import io.cucumber.junit.CucumberOptions;

import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;
import org.junit.runner.RunWith;

import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;

//@Suite
//@IncludeEngines("cucumber")
//@SelectClasspathResource("/features")
//
//@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "io.cucumber.core.plugin.SerenityReporterParallel,pretty,timeline:build/test-results/timeline")

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = {
                "src/test/resources/features/01.LoginSaucedemo.feature",
                "src/test/resources/features/02.DetailProduct.feature",
                "src/test/resources/features/03.AddToCart.feature",
                "src/test/resources/features/04.Checkout.feature"
        },
        glue = "com/saucedemo/stepdefinitions"
)

public class CucumberTestSuite {

}
