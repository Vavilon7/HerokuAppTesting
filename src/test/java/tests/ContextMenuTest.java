package tests;

import com.theinternet.pages.config.pages.ContextMenuPage;
import com.theinternet.pages.config.pages.HomePage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ContextMenuTest extends TestBase{
    ContextMenuPage contextMenuPage;

    @BeforeEach
    public void precondition() {
        new HomePage(driver).openContextMenuPage();
        contextMenuPage = new ContextMenuPage(driver);
    }

    @Test
    public void contextClickTest() {
        contextMenuPage.rightClickBox().handleAlert();
    }
}