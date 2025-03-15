package com.theinternet.pages.config.pages;

import com.theinternet.pages.config.BasePage;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage extends BasePage {
    public NestedFramesPage(WebDriver driver) {
        super(driver);
    }

    public String getLeftFrameText() {
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-left");
        String text = driver.findElement(org.openqa.selenium.By.tagName("body")).getText();
        driver.switchTo().defaultContent();
        return text;
    }

    public String getMiddleFrameText() {
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-middle");
        String text = driver.findElement(org.openqa.selenium.By.id("content")).getText();
        driver.switchTo().defaultContent();
        return text;
    }

    public String getRightFrameText() {
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-right");
        String text = driver.findElement(org.openqa.selenium.By.tagName("body")).getText();
        driver.switchTo().defaultContent();
        return text;
    }

    public String getBottomFrameText() {
        driver.switchTo().frame("frame-bottom");
        String text = driver.findElement(org.openqa.selenium.By.tagName("body")).getText();
        driver.switchTo().defaultContent();
        return text;
    }

}
