package steps;

import pages.tc_002Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.assertTrue;

public class tc_002Steps {
    private tc_002Page uploadPage = new tc_002Page();

    @Given("El usuario está en la página de subida de archivos")
    public void elUsuarioEstaEnLaPaginaDeSubidaDeArchivos() {
        uploadPage.navigateToUploadPage();
    }

    @When("El usuario selecciona un archivo con formato válido PDF/DOCX y tamaño dentro del límite")
    public void elUsuarioSeleccionaUnArchivoConFormatoValido() {
        uploadPage.selectValidFile();
    }

    @Then("El archivo se carga con éxito")
    public void elArchivoSeCargaConExito() {
        assertTrue(uploadPage.isFileUploadedSuccessfully());
    }

    @Then("Se muestra la vista previa del archivo con nombre, tamaño y tipo")
    public void seMuestraLaVistaPreviaDelArchivo() {
        assertTrue(uploadPage.isFilePreviewDisplayed());
    }
}