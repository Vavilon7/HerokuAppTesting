package com.theinternet.pages.config.pages;

import com.theinternet.pages.config.BasePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class SliderPage extends BasePage {
    public SliderPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input[type='range']")
    WebElement slider;

    @FindBy(id = "range")
    WebElement sliderValue;

    public SliderPage moveSliderToHorizontalDirection() {
        pause(1000);
        scrollWithJS(0, 200);

        // Примерно подвинуть на максимум вправо
        new Actions(driver).dragAndDropBy(slider, 250, 0).perform();

        return this;
    }

    public SliderPage verifySliderValue(String expectedValue) {
        String actualValue = sliderValue.getText();
        System.out.println("Ожидаемое: " + expectedValue + ", Фактическое: " + actualValue);
        Assertions.assertEquals(expectedValue, actualValue, "Значение слайдера не совпадает!");
        return this;
    }
}