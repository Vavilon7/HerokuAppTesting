package com.theinternet.pages.config.pages;

import com.theinternet.pages.config.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(linkText = "Form Authentication")
    WebElement formAuthLink;

    public void openLoginPage() {
        click(formAuthLink);
    }
}
