package tests;

import com.theinternet.pages.config.pages.HomePage;
import com.theinternet.pages.config.pages.JavaScriptAlertsPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class JavaScriptAlertsTest extends TestBase {
    JavaScriptAlertsPage alertsPage;

    @BeforeEach
    public void precondition() {
        // Открываем главную страницу и переходим в JavaScript Alerts
        new HomePage(driver).openJavaScriptAlertsPage();

        // Инициализируем страницу алертов
        alertsPage = new JavaScriptAlertsPage(driver);
    }

    @Test
    @DisplayName("Verify Alert - Click OK and Check Message")
    public void testJSAlert() {
        alertsPage.clickAlertButton();
        alertsPage.acceptAlert();
        assertTrue(alertsPage.isResultMessageDisplayed("You successfully clicked an alert"));
    }

    @Test
    @DisplayName("Verify Confirm - Click Cancel and Check Message")
    public void testJSConfirmCancel() {
        alertsPage.clickConfirmButton();
        alertsPage.dismissAlert();
        assertTrue(alertsPage.isResultMessageDisplayed("You clicked: Cancel"));
    }

    @Test
    @DisplayName("Verify Prompt - Enter text and Check Message")
    public void testJSPrompt() {
        String text = "Vavilon7";
        alertsPage.clickPromptButton();
        alertsPage.enterTextInAlert(text);
        alertsPage.acceptAlert();

        // Проверка результата
        boolean isMessageCorrect = alertsPage.isResultMessageDisplayed("You entered: " + text);

        // Вывод сообщения в консоль
        if (isMessageCorrect) {
            System.out.println("Тест пройден: Введенное слово '" + text + "' успешно отобразилось в результате.");
        } else {
            System.out.println("Ошибка: Введенное слово '" + text + "' не найдено в результате.");
        }

        assertTrue(isMessageCorrect);
    }
}