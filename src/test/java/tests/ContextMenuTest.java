package tests;

import com.theinternet.pages.config.pages.ContextMenuPage;
import com.theinternet.pages.config.pages.HomePage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContextMenuTest extends TestBase{
    ContextMenuPage contextMenuPage;

    @BeforeEach
    public void precondition() {
        new HomePage(driver).openContextMenuPage();
        contextMenuPage = new ContextMenuPage(driver);
    }

    @Test
    public void contextClickTest() {
        String alertText = contextMenuPage.rightClickBox().handleAlert();
        assertEquals("You selected a context menu", alertText, "Текст алерта не совпадает с ожидаемым");
    }
}