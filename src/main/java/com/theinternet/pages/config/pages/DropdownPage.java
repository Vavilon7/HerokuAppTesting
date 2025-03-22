package com.theinternet.pages.config.pages;

import com.theinternet.pages.config.BasePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class DropdownPage extends BasePage {
    public DropdownPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "dropdown")
    WebElement dropdown;

    public void selectOption(String optionText) {
        Select select = new Select(dropdown);
        select.selectByVisibleText(optionText);
    }

    public void verifySelectedOption(String expectedText) {
        Select select = new Select(dropdown);
        String selectedText = select.getFirstSelectedOption().getText();
        Assertions.assertEquals(expectedText, selectedText);
    }

}
