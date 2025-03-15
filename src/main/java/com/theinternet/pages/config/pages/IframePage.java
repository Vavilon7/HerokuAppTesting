package com.theinternet.pages.config.pages;

import com.theinternet.pages.config.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IframePage extends BasePage {
    public IframePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[contains(@class,'tox-notification__dismiss')]")
    WebElement closePopupButton;

    @FindBy(tagName = "iframe")
    WebElement iframe;

    @FindBy(tagName = "p")
    WebElement iframeText;

    public void closePopupNotification() {
        if (closePopupButton.isDisplayed()) {
            click(closePopupButton);
        }
    }

    public String getIframeText() {
        driver.switchTo().frame(iframe);
        String text = iframeText.getText();
        driver.switchTo().defaultContent();
        return text;
    }

}
