package com.theinternet.pages.config.pages;
import com.theinternet.pages.config.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JavaScriptAlertsPage extends BasePage {
    public JavaScriptAlertsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[text()='Click for JS Alert']")
    WebElement alertButton;

    @FindBy(xpath = "//button[text()='Click for JS Confirm']")
    WebElement confirmButton;

    @FindBy(xpath = "//button[text()='Click for JS Prompt']")
    WebElement promptButton;

    @FindBy(id = "result")
    WebElement resultMessage;

    public void clickAlertButton() {
        click(alertButton);
    }

    public void clickConfirmButton() {
        click(confirmButton);
    }

    public void clickPromptButton() {
        click(promptButton);
    }

    public void acceptAlert() {
        driver.switchTo().alert().accept();
    }

    public void dismissAlert() {
        driver.switchTo().alert().dismiss();
    }

    public void enterTextInAlert(String text) {
        driver.switchTo().alert().sendKeys(text);
    }

    public boolean isResultMessageDisplayed(String expectedText) {
        return containsText(resultMessage, expectedText);
    }
}