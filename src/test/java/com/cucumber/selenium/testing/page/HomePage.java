package com.cucumber.selenium.testing.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    public WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    private By poster = By.xpath("/html/body/div[2]/div/div/div/div/canvas");

    public boolean isPosterPresent() {
        return driver.findElement(poster).isDisplayed();
    }
}
