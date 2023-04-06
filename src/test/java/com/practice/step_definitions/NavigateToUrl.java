package com.practice.step_definitions;

import com.practice.utilities.Driver;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.cucumber.java.en.Given;

public class NavigateToUrl {

    WebElement button = Driver.getDriver().findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']"));

    @And("accepts cookies")
    public void acceptsCookies() {
        button.click();

    }


    @Given("user navigates to {string}")
    public void user_navigates_to(String url) {
        Driver.getDriver().get(url);
    }

}
