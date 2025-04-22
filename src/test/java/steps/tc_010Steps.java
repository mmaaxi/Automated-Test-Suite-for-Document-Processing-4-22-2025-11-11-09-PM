package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc_010Page;

public class tc_010Steps {
    WebDriver driver;
    tc_010Page page;

    public tc_010Steps() {
        this.driver = Hooks.getDriver();
        page = PageFactory.initElements(driver, tc_010Page.class);
    }

    @Given("el usuario ha iniciado sesión en el sistema")
    public void elUsuarioHaIniciadoSesionEnElSistema() {
        page.loginToSystem();
    }

    @When("el usuario sube los documentos requeridos")
    public void elUsuarioSubeLosDocumentosRequeridos() {
        page.uploadDocuments();
    }

    @When("el usuario inicia el procesamiento de los documentos")
    public void elUsuarioIniciaElProcesoDeLosDocumentos() {
        page.processDocuments();
    }

    @Then("el sistema genera el 'Slip de salida'")
    public void elSistemaGeneraElSlipDeSalida() {
        page.verifySlipGeneration();
    }

    @Then("el sistema guarda los documentos originales y datos extraídos en el historial de la solicitud")
    public void elSistemaGuardaLosDocumentosEnElHistorial() {
        page.verifyDocumentsSavedInHistory();
    }
}