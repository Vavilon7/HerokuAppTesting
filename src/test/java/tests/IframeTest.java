package tests;

import com.theinternet.pages.config.pages.HomePage;
import com.theinternet.pages.config.pages.IframePage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IframeTest extends TestBase {
    IframePage iframePage;

    @BeforeEach
    public void precondition() {
        // Открываем страницу iFrame
        new HomePage(driver).openIframePage();
        iframePage = new IframePage(driver);
    }

    @Test
    @DisplayName("Verify iFrame text and close notification")
    public void testIframeContent() {
        // Закрываем всплывающее сообщение
        iframePage.closePopupNotification();

        // Получаем текст из iFrame
        String text = iframePage.getIframeText();

        // Проверяем, что текст соответствует ожидаемому
        assertEquals("Your content goes here.", text, "Текст в iFrame неверный!");
        System.out.println(" iFrame тест пройден: " + text);
    }
}