package tests;

import com.theinternet.pages.config.pages.HomePage;
import com.theinternet.pages.config.pages.SliderPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SliderTest extends TestBase{
    SliderPage sliderPage;

    @BeforeEach
    public void precondition() {
        new HomePage(driver).openSliderPage();
        sliderPage = new SliderPage(driver);
    }

    @Test
    public void moveSliderTest() {
        sliderPage.moveSliderToHorizontalDirection().verifySliderValue("5");
    }
}
