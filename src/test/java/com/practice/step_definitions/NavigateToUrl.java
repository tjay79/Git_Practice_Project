package com.practice.step_definitions;

import com.practice.utilities.Driver;
import io.cucumber.java.en.And;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.cucumber.java.en.Given;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NavigateToUrl {


    @And("accepts cookies")
    public void acceptsCookies() {
        WebElement button = Driver.getDriver().findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']"));
        button.click();

    }


    @Given("user navigates to {string}")
    public void user_navigates_to(String url) {
        Driver.getDriver().get(url);
    }


    @Given("chooses gender")
    public void chooses_gender() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),3);
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Beymen.com – Türkiye’nin"));
        wait.until(ExpectedConditions.visibilityOf(Driver.getDriver().findElement(By.xpath("//span[@class=\"genderPopup__title\"]"))));
        Driver.getDriver().findElement(By.id("genderWomanButton")).click();



        }


}
