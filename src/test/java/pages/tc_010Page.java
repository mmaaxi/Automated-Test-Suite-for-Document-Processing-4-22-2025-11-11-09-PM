package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_010Page {

    WebDriver driver;

    By loginPage = By.id("loginPage");
    By uploadButton = By.id("uploadButton");
    By processButton = By.id("processButton");
    By slipOutput = By.id("slipOutput");
    By historyRecords = By.id("historyRecords");

    public tc_010Page(WebDriver driver) {
        this.driver = driver;
    }

    public void loginToSystem() {
        driver.findElement(loginPage).click();
        // Assume login process including entering username and password
    }

    public void uploadDocuments() {
        driver.findElement(uploadButton).sendKeys("/path/to/documents");
        // Additional actions for confirming the upload
    }

    public void processDocuments() {
        driver.findElement(processButton).click();
        // Wait for processing to complete
    }

    public void verifySlipGeneration() {
        boolean isSlipGenerated = driver.findElement(slipOutput).isDisplayed();
        assert isSlipGenerated : "Slip de salida no fue generado.";
    }

    public void verifyDocumentsSavedInHistory() {
        boolean areDocumentsSaved = driver.findElement(historyRecords).isDisplayed();
        assert areDocumentsSaved : "Los documentos no se guardaron en el historial.";
    }
}