package tests;

import com.theinternet.pages.config.pages.HomePage;
import com.theinternet.pages.config.pages.MultipleWindowsPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultipleWindowsTest extends TestBase{
    MultipleWindowsPage multipleWindowsPage;

    @BeforeEach
    public void precondition() {
        new HomePage(driver).openMultipleWindowsPage();
        multipleWindowsPage = new MultipleWindowsPage(driver);
    }

    @Test
    @Tag("smoke")
    @DisplayName("Открыть новую вкладку и проверить заголовок")
    public void testMultipleWindows() {
        multipleWindowsPage.clickHere();
        multipleWindowsPage.switchToNewTab(1);
        String actualHeader = multipleWindowsPage.getHeaderText();
        assertEquals("New Window", actualHeader, "Заголовок на новой вкладке не совпадает с ожидаемым");
        System.out.println("Фактический заголовок: " + actualHeader);
    }
}