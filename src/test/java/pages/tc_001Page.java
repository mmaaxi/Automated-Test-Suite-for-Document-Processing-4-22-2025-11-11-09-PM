package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_001Page {

    WebDriver driver;

    By uploadOption = By.id("uploadOption");
    By singleUploadMode = By.id("singleUpload");
    By multipleUploadMode = By.id("multipleUpload");
    By singleUploadBox = By.id("singleUploadBox");
    By multipleUploadBoxes = By.className("multipleUploadBoxes");

    public tc_001Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToUploadPage() {
        driver.get("http://example.com/upload");
    }

    public void selectUploadOption() {
        driver.findElement(uploadOption).click();
    }

    public boolean isSingleAndMultipleUploadOptionsDisplayed() {
        return driver.findElement(singleUploadMode).isDisplayed() &&
               driver.findElement(multipleUploadMode).isDisplayed();
    }

    public void selectSingleUploadMode() {
        driver.findElement(singleUploadMode).click();
    }

    public boolean isSingleUploadBoxEnabled() {
        return driver.findElement(singleUploadBox).isDisplayed();
    }

    public void selectMultipleUploadMode() {
        driver.findElement(multipleUploadMode).click();
    }

    public boolean areMultipleUploadBoxesDisplayed() {
        return driver.findElements(multipleUploadBoxes).size() > 0;
    }
}