package com.theinternet.pages.config.pages;

import com.theinternet.pages.config.BasePage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ContextMenuPage extends BasePage {
    public ContextMenuPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "hot-spot")
    WebElement box;

    public ContextMenuPage rightClickBox() {
        new Actions(driver).contextClick(box).perform();
        return this;
    }

    public String handleAlert() {
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        System.out.println("Текст алерта: " + alertText);
        alert.accept();
        return alertText;
    }
}
