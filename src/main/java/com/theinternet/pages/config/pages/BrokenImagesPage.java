package com.theinternet.pages.config.pages;

import com.theinternet.pages.config.BasePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class BrokenImagesPage extends BasePage {
    public BrokenImagesPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(tagName = "img")
    List<WebElement> images;

    public void checkBrokenImages() {
        int brokenCount = 0;

        for (WebElement image : images) {
            String imageUrl = image.getAttribute("src");
            try {
                HttpURLConnection connection = (HttpURLConnection) new URL(imageUrl).openConnection();
                connection.setConnectTimeout(5000);
                connection.connect();
                int statusCode = connection.getResponseCode();
                if (statusCode >= 400) {
                    brokenCount++;
                    System.out.println(" Broken image: " + imageUrl + " --> " + statusCode);
                } else {
                    System.out.println(" Valid image: " + imageUrl + " --> " + statusCode);
                }
            } catch (Exception e) {
                brokenCount++;
                System.out.println("️ Error with image: " + imageUrl + " --> " + e.getMessage());
            }
        }

        Assertions.assertEquals(0, brokenCount, "Найдены битые картинки: " + brokenCount);
    }

}
