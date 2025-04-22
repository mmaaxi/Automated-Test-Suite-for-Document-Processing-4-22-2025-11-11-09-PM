package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class tc_002Page {
    WebDriver driver;

    private By uploadButton = By.id("fileUploadButton");
    private By previewSection = By.id("filePreview");

    public tc_002Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void navigateToUploadPage() {
        // Código para navegar a la página de subida de archivos
        driver.get("https://example.com/upload");
    }

    public void selectValidFile() {
        // Código para seleccionar un archivo válido
        WebElement uploadElement = driver.findElement(uploadButton);
        uploadElement.sendKeys("/path/to/valid/file.pdf");
    }

    public boolean isFileUploadedSuccessfully() {
        // Verificar si el archivo se ha cargado exitosamente
        return driver.findElement(previewSection).isDisplayed();
    }

    public boolean isFilePreviewDisplayed() {
        // Comprobación para verificar la vista previa
        WebElement preview = driver.findElement(previewSection);
        boolean nameDisplayed = preview.getText().contains("file.pdf");
        boolean sizeDisplayed = preview.getText().contains("50 MB");
        boolean typeDisplayed = preview.getText().contains("PDF");

        return nameDisplayed && sizeDisplayed && typeDisplayed;
    }
}