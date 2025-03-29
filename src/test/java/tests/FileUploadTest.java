package tests;

import com.theinternet.pages.config.pages.FileUploadPage;
import com.theinternet.pages.config.pages.HomePage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FileUploadTest extends TestBase{
    FileUploadPage fileUploadPage;
    @BeforeEach
    public void precondition() {
        new HomePage(driver).openFileUploadPage();
        fileUploadPage = new FileUploadPage(driver);
    }
    @Test
    public void testFileUpload() {
        fileUploadPage
                .uploadFile() // Без аргумента
                .submit()
                .verifyUploadSuccessMessage()
                .verifyUploadedFileName("istockphoto-1133819651-1024x1024.jpg");
    }
}

