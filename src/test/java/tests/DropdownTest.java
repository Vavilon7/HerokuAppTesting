package tests;

import com.theinternet.pages.config.pages.DropdownPage;
import com.theinternet.pages.config.pages.HomePage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class DropdownTest extends TestBase{
    DropdownPage dropdownPage;

    @BeforeEach
    public void precondition() {
        new HomePage(driver).openDropdownPage();
        dropdownPage = new DropdownPage(driver);
    }

    @ParameterizedTest
    @ValueSource(strings = {"Option 1", "Option 2"})
    public void testSelectDropdownOption(String option) {
        dropdownPage.selectOption(option);
        dropdownPage.verifySelectedOption(option);
    }

}
