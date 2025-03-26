package tests;
import com.theinternet.pages.config.pages.HomePage;
import com.theinternet.pages.config.pages.StatusCodesPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StatusCodesTest extends TestBase {
    StatusCodesPage statusCodesPage;
    @BeforeEach
    public void precondition() {
        new HomePage(driver).openStatusCodesPage();
        statusCodesPage = new StatusCodesPage(driver);
    }

    @Test
    public void testStatusCodeLinks() {
        statusCodesPage.checkStatusCodeLinks();
    }
}
