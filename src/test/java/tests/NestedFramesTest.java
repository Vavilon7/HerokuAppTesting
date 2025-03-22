package tests;

import com.theinternet.pages.config.pages.HomePage;
import com.theinternet.pages.config.pages.NestedFramesPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NestedFramesTest extends TestBase {
    NestedFramesPage nestedFramesPage;

    @BeforeEach
    public void precondition() {
        // Переход на страницу Nested Frames
        new HomePage(driver).openNestedFramesPage();
        nestedFramesPage = new NestedFramesPage(driver);
    }

    @Test
    @DisplayName("Verify LEFT frame content")
    public void testLeftFrame() {
        String text = nestedFramesPage.getLeftFrameText();
        assertEquals("LEFT", text, "Текст в левом фрейме неверный!");
        System.out.println(" LEFT frame тест пройден: " + text);
    }

    @Test
    @DisplayName("Verify MIDDLE frame content")
    public void testMiddleFrame() {
        String text = nestedFramesPage.getMiddleFrameText();
        assertEquals("MIDDLE", text, "Текст в среднем фрейме неверный!");
        System.out.println(" MIDDLE frame тест пройден: " + text);
    }

    @Test
    @DisplayName("Verify RIGHT frame content")
    public void testRightFrame() {
        String text = nestedFramesPage.getRightFrameText();
        assertEquals("RIGHT", text, "Текст в правом фрейме неверный!");
        System.out.println(" RIGHT frame тест пройден: " + text);
    }

    @Test
    @DisplayName("Verify BOTTOM frame content")
    public void testBottomFrame() {
        String text = nestedFramesPage.getBottomFrameText();
        assertEquals("BOTTOM", text, "Текст в нижнем фрейме неверный!");
        System.out.println(" BOTTOM frame тест пройден: " + text);
    }
}