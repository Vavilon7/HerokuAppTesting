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
    @FindBy(linkText = "Multiple Windows")
    WebElement multipleWindowsLink;

    public void openMultipleWindowsPage() {
        click(multipleWindowsLink);
    }
    @FindBy(linkText = "Dropdown")
    WebElement dropdownLink;

    public void openDropdownPage() {
        click(dropdownLink);
    }
    @FindBy(linkText = "Drag and Drop")
    WebElement dragAndDropLink;

    public void openDragAndDropPage() {
        click(dragAndDropLink);
    }
    @FindBy(linkText = "Context Menu")
    WebElement contextMenuLink;

    public void openContextMenuPage() {
        click(contextMenuLink);
    }
    @FindBy(linkText = "Horizontal Slider")
    WebElement sliderLink;

    public void openSliderPage() {
        click(sliderLink);
    }
    @FindBy(linkText = "Broken Images")
    WebElement brokenImagesLink;

    public void openBrokenImagesPage() {
        clickWithJS(brokenImagesLink, 0, 300);
    }

    @FindBy(linkText = "Status Codes")
    WebElement statusCodesLink;

    public void openStatusCodesPage() {
        clickWithJS(statusCodesLink, 0, 300);
    }

}