package tests;

import com.theinternet.pages.config.pages.DragAndDropPage;
import com.theinternet.pages.config.pages.HomePage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DragAndDropTest extends TestBase{
    DragAndDropPage dragAndDropPage;

    @BeforeEach
    public void precondition() {
        new HomePage(driver).openDragAndDropPage();
        dragAndDropPage = new DragAndDropPage(driver);
    }

    @Test
    public void dragAtoBTest() {
        dragAndDropPage.dragAtoB().printColumnText();
    }
}
