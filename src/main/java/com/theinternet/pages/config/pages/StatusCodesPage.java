package com.theinternet.pages.config.pages;

import com.theinternet.pages.config.BasePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class StatusCodesPage extends BasePage {
    public StatusCodesPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "a[href*='status_codes/']")
    List<WebElement> statusCodeLinks;

    public void checkStatusCodeLinks() {
        int errorCount = 0;

        for (WebElement link : statusCodeLinks) {
            String url = link.getAttribute("href");
            try {
                HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
                connection.setConnectTimeout(5000);
                connection.connect();
                int code = connection.getResponseCode();
                if (code >= 400) {
                    errorCount++;
                    System.out.println(" Broken link: " + url + " returned code: " + code);
                } else {
                    System.out.println(" Valid link: " + url + " returned code: " + code);
                }
            } catch (Exception e) {
                errorCount++;
                System.out.println(" Error checking link: " + url + " - " + e.getMessage());
            }
        }

        Assertions.assertEquals(0, errorCount, "Обнаружены некорректные ссылки: " + errorCount);
    }

}
