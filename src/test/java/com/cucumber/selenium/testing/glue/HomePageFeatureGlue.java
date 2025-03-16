package com.cucumber.selenium.testing.glue;

import com.cucumber.selenium.testing.page.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePageFeatureGlue {
    private WebDriver driver;
    private HomePage homePage;

    public HomePageFeatureGlue() {
        this.driver = new ChromeDriver();
        this.homePage = new HomePage(driver);
    }

    @Given("User is on the Home Page")
    public void goToHomePage() {
        driver.get("http://localhost:3000/home");
    }

    @When("User stay")
    public void whenUserStay() {}

    @Then("User can see the poster")
    public void verifyIsPosterPresent() {
        Assertions.assertTrue(homePage.isPosterPresent());
    }
}
