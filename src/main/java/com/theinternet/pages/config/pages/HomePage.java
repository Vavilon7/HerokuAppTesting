package com.theinternet.pages.config.pages;
import com.theinternet.pages.config.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(linkText = "JavaScript Alerts")
    WebElement jsAlertsLink;

    public void openJavaScriptAlertsPage() {
        click(jsAlertsLink);
    }
    @FindBy(linkText = "Frames")
    WebElement framesLink;

    @FindBy(linkText = "Nested Frames")
    WebElement nestedFramesLink;
    @FindBy(linkText = "iFrame")
    WebElement iframeLink;

    public void openNestedFramesPage() {
        click(nestedFramesLink);
    }
    public void openIframePage() {
        click(framesLink);
        click(iframeLink);
    }
}