package steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pages.tc_001Page;
import static org.junit.Assert.*;

public class tc_001Steps {

    WebDriver driver;
    tc_001Page page;

    @Given("El usuario está en la página de carga de documentos")
    public void el_usuario_está_en_la_página_de_carga_de_documentos() {
        // Configurar el WebDriver y navegar a la página de carga de documentos
        driver = new WebDriverManager().setupDriver();
        page = new tc_001Page(driver);
        page.navigateToUploadPage();
    }

    @When("Selecciona la opción 'cargar documentos'")
    public void selecciona_la_opción_cargar_documentos() {
        page.selectUploadOption();
    }

    @Then("El sistema muestra opción para carga única y carga múltiple")
    public void el_sistema_muestra_opción_para_carga_única_y_carga_múltiple() {
        assertTrue(page.isSingleAndMultipleUploadOptionsDisplayed());
    }

    @When("Elige 'carga en un solo archivo'")
    public void elige_carga_en_un_solo_archivo() {
        page.selectSingleUploadMode();
    }

    @Then("Se habilita un único recuadro para subir el archivo")
    public void se_habilita_un_único_recuadro_para_subir_el_archivo() {
        assertTrue(page.isSingleUploadBoxEnabled());
    }

    @When("Elige 'cargar documentos por separado'")
    public void elige_cargar_documentos_por_separado() {
        page.selectMultipleUploadMode();
    }

    @Then("Se muestran múltiples recuadros correspondientes a cada documento requerido")
    public void se_muestran_múltiples_recuadros_correspondientes_a_cada_documento_requerido() {
        assertTrue(page.areMultipleUploadBoxesDisplayed());
    }
}