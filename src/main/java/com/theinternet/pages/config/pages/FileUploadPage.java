package com.theinternet.pages.config.pages;

import com.theinternet.pages.config.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FileUploadPage extends BasePage {
    public FileUploadPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "file-upload")
    WebElement uploadPicture;

    @FindBy(id = "file-submit")
    WebElement uploadButton;

    @FindBy(tagName = "h3")
    WebElement uploadMessage;

    @FindBy(id = "uploaded-files")
    WebElement uploadedFileName;

    // Загрузка файла
    public FileUploadPage uploadFile(String path) {
        uploadPicture.sendKeys(path);
        return this;
    }

    // Отправка формы
    public FileUploadPage submit() {
        uploadButton.click();
        return this;
    }

    // Проверка текста "File Uploaded!"
    public FileUploadPage verifyUploadSuccessMessage() {
        assertTrue(uploadMessage.getText().contains("File Uploaded!"),
                "Ожидалось сообщение 'File Uploaded!'");
        return this;
    }

    // Проверка, что имя загруженного файла отображается
    public FileUploadPage verifyUploadedFileName(String expectedFileName) {
        assertTrue(uploadedFileName.getText().contains(expectedFileName),
                "Имя загруженного файла не отображается: " + expectedFileName);
        return this;
    }
    public FileUploadPage uploadFile() {
        String path = "C:\\Tools\\istockphoto-1133819651-1024x1024.jpg";
        uploadPicture.sendKeys(path);
        return this;
    }
}