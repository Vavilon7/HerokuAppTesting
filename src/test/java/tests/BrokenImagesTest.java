package tests;

import com.theinternet.pages.config.pages.BrokenImagesPage;
import com.theinternet.pages.config.pages.HomePage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BrokenImagesTest extends TestBase{
    BrokenImagesPage brokenImagesPage;

    @BeforeEach
    public void precondition() {
        new HomePage(driver).openBrokenImagesPage();
        brokenImagesPage = new BrokenImagesPage(driver);
    }
    @Test
    public void testBrokenImages() {
        new BrokenImagesPage(driver).checkBrokenImages();
    }

}
