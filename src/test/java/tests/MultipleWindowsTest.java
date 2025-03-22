package tests;

import com.theinternet.pages.config.pages.HomePage;
import com.theinternet.pages.config.pages.MultipleWindowsPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MultipleWindowsTest extends TestBase{
    MultipleWindowsPage multipleWindowsPage;

    @BeforeEach
    public void precondition() {
        new HomePage(driver).openMultipleWindowsPage();
        multipleWindowsPage = new MultipleWindowsPage(driver);
    }

    @Test
    @DisplayName("Открыть новую вкладку и вывести заголовок")
    public void testMultipleWindows() {
        multipleWindowsPage.clickHere();
        multipleWindowsPage.switchToNewTab(1);
        multipleWindowsPage.printHeaderText(); // Без assert
    }
}