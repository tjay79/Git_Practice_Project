package com.practice.step_definitions;

import com.practice.utilities.Driver;
import io.cucumber.java.en.Given;

public class NavigateToUrl {


    @Given("user navigates to {string}")
    public void user_navigates_to(String url) {
        Driver.getDriver().get(url);
    }

}
