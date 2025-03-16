package com.cucumber.selenium.testing.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
import org.junit.runner.RunWith;

import static io.cucumber.core.options.Constants.GLUE_PROPERTY_NAME;
import static io.cucumber.core.options.Constants.PLUGIN_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features")
@SelectPackages("com.cucumber.selenium.testing")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "com.cucumber.selenium.testing.glue")
/**
@RunWith(Cucumber.class)
@CucumberOptions
(
features="src/test/java/com/cucumber/selenium/testing/feature"
,glue ="glue"
,monochrome=true
,plugin= {"html:target/cucumber.html"}
)
*/
public class TestRunner {
}
