package com.practice.step_definitions;

import com.practice.utilities.Driver;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class NavigateToUrl {

    WebElement button = Driver.getDriver().findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']"));

     @And("accepts cookies")
    public void acceptsCookies() {
        button.click();

    }
}