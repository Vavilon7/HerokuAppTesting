package com.theinternet.pages.config.pages;

import com.theinternet.pages.config.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class DragAndDropPage extends BasePage {
    public DragAndDropPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "column-a")
    WebElement columnA;

    @FindBy(id = "column-b")
    WebElement columnB;

    public DragAndDropPage dragAtoB() {
        pause(1000);
        new Actions(driver).dragAndDrop(columnA, columnB).perform();
        return this;
    }

    public DragAndDropPage printColumnText() {
        System.out.println("Колонка B после дропа содержит: " + columnB.getText());
        return this;
    }

}
