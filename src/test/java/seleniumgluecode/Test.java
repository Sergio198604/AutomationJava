package seleniumgluecode;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test extends TestBase {

    @Given("^El usuario se encuentra en la pagina de PVI$")
    public void el_usuario_se_encuentra_en_la_pagina_de_PVI() {
        Assert.assertEquals(homePage.getTitleHomePage(), driver.getTitle());
    }

    @When("^ingresa su usuario$")
    public void ingresa_su_usuario() {
        WebElement nombredeUsuario = driver.findElement(homePage.getNombredeUsuario());
        nombredeUsuario.sendKeys("planok");
    }

    @When("^ingresa su contraseña$")
    public void ingresa_su_contraseña() {
        WebElement contraseñaUsuario = driver.findElement(homePage.getContraseñaUsuario());
        contraseñaUsuario.sendKeys("123456");
    }

    @Then("^presionar Ingresar$")
    public void presionar_Ingresar() {
        WebElement ingreso = driver.findElement(homePage.getIngreso());
        ingreso.click();
    }

    @Then("^ingresar en el buscador$")
    public void ingresar_en_el_buscador() {
        WebElement buscador = driver.findElement(oipage.getBuscador());
        buscador.sendKeys("PRU - DEPTO. 0203");
    }

    @Then("^presionar Buscar$")
    public void presionar_Buscar() {
        WebElement btnBuscar = driver.findElement(oipage.getBtnBuscar());
        btnBuscar.click();
    }

    @Then("^presionar Ingreso primera solicitud$")
    public void presionar_Ingreso_primera_solicitud() {
        WebElement prmrReq = driver.findElement(oipage.getPrmrReq());
        prmrReq.click();
    }

    @Then("^seleccionar medio de ingreso$")
    public void seleccionar_medio_de_ingreso() {
        Select ddMedioingreso = new Select(driver.findElement(By.id("r_medio_recepcion_id")));
        ddMedioingreso.selectByIndex(3);
    }

    @Then("^Agregar primer requerimiento$")
    public void agregar_primer_requerimiento() {
        WebDriverWait wait = new WebDriverWait(driver, 3);
        WebElement primerReq = wait.until(ExpectedConditions.elementToBeClickable(oipage.getPrimerReq()));
        primerReq.click();
    }

    @Then("^seleccionar recinto$")
    public void seleccionar_recinto() throws InterruptedException {
        Thread.sleep(5000);
        Select recinto1 = new Select(driver.findElement(By.id("getRecinto")));
        recinto1.selectByIndex(1);
    }

    @Then("^seleccionar lugar$")
    public void seleccionar_lugar() throws InterruptedException {
        Thread.sleep(5000);
        Select lugar1 = new Select(driver.findElement(By.id("getLugar")));
        lugar1.selectByIndex(19);
    }

    @Then("^seleccionar item$")
    public void seleccionar_item() throws InterruptedException {
        Thread.sleep(5000);
        Select item1 = new Select(driver.findElement(By.id("getItem")));
        item1.selectByIndex(1);
    }

    @Then("^seleccionar problema$")
    public void seleccionar_problema() throws InterruptedException {
        Thread.sleep(5000);
        Select problema1 = new Select(driver.findElement(By.id("getProblema")));
        problema1.selectByIndex(1);
    }

    @Then("^descripcion problema$")
    public void descripcion_problema() {
        WebElement descripcionProblema = driver.findElement(oipage.getDescripcionProblema());
        descripcionProblema.sendKeys("test de prueba automatizado");
    }

    @Then("^seleccionar responsable$")
    public void seleccionar_responsable() {
        Select responsable1 = new Select(driver.findElement(By.id("responsable_id")));
        responsable1.selectByValue("48");
    }

    @Then("^guardar requerimiento$")
    public void guardar_requerimiento() throws InterruptedException {
        Thread.sleep(3000);
        WebElement guardarReq = driver.findElement(oipage.getGuardarReq());
        guardarReq.click();
    }

    @Then("^Agregar segundo requerimiento$")
    public void agregar_segundo_requerimiento() {
        WebElement segReq = driver.findElement(oipage.getSegReq());
        segReq.click();
    }

    @Then("^seleccionar segundo recinto$")
    public void seleccionar_segundo_recinto() throws InterruptedException {
        Thread.sleep(3000);
        Select recinto2 = new Select(driver.findElement(By.id("getRecinto")));
        recinto2.selectByIndex(1);
    }

    @Then("^seleccionar segundo lugar$")
    public void seleccionar_segundo_lugar() throws InterruptedException {
        Thread.sleep(3000);
        Select lugar2 = new Select(driver.findElement(By.id("getLugar")));
        lugar2.selectByIndex(19);
    }

    @Then("^seleccionar segundo item$")
    public void seleccionar_segundo_item() throws InterruptedException {
        Thread.sleep(4000);
        Select item2 = new Select(driver.findElement(By.id("getItem")));
        item2.selectByIndex(1);
    }

    @Then("^seleccionar segundo problema$")
    public void seleccionar_segundo_problema() throws InterruptedException {
        Thread.sleep(3000);
        Select problema2 = new Select(driver.findElement(By.id("getProblema")));
        problema2.selectByIndex(1);
    }

    @Then("^descripcion segundo problema$")
    public void descripcion_segundo_problema() throws InterruptedException {
        Thread.sleep(3000);
        WebElement descripcionProblema2 = driver.findElement(oipage.getDescripcionProblema());
        descripcionProblema2.sendKeys("test de prueba automatizado 2");
    }

    @Then("^guardar segundo requerimiento$")
    public void guardar_segundo_requerimiento() {
        WebElement guardarReq2 = driver.findElement(oipage.getGuardarReq());
        guardarReq2.click();
    }

    @Then("^vista previa$")
    public void vista_previa() throws InterruptedException {
        Thread.sleep(3000);
        WebElement vistaPrevia = driver.findElement(oipage.getVistaPrevia());
        vistaPrevia.click();
    }

    @Then("^enviar solicitud$")
    public void enviar_solicitud() throws InterruptedException {
        Thread.sleep(3000);
        WebElement botonEnvio = driver.findElement(oipage.getBtnEnvio());
        botonEnvio.click();
    }

    @Then("^marcar propietarios$")
    public void marcar_propietarios() throws InterruptedException {
        Thread.sleep(2000);
        WebElement checkProp = driver.findElement(oipage.getCheckProp());
        boolean b = checkProp.isSelected();
        System.out.println(b);
        if (!b) {
            checkProp.click();
        }
        System.out.println(driver.findElement(oipage.getCheckProp()).isSelected());
        Thread.sleep(2000);
    }

    @Then("^marcar enviar copia$")
    public void marcar_enviar_copia() {
        WebElement checkCopia = driver.findElement(oipage.getCheckCopia());
        checkCopia.isSelected();
        checkCopia.click();
    }

    @Then("^ingresar mail CC$")
    public void ingresar_mail_CC() throws Throwable {
        Thread.sleep(1000);
        WebElement mail = driver.findElement(oipage.getCopiaMail());
        mail.sendKeys("interno@yopmail.com");
    }

    @Then("^envio solicitud final$")
    public void envioSolicitudFinal() throws InterruptedException {
        WebElement envioFinal = driver.findElement(oipage.getEnvioFinal());
        envioFinal.click();
        Thread.sleep(5000);
    }

    @And("^orden de inspección$")
    public void ordenDeInspección() {
        WebElement ordenInspeccion = driver.findElement(diagpage.getOrdendeInspeccion());
        ordenInspeccion.click();
    }

    @And("^requerimientos$")
    public void requerimientos() {
        WebElement requerimientos = driver.findElement(diagpage.getRequerimientos());
        requerimientos.click();
    }

    @And("^check Masivo$")
    public void checkMasivo() {
        WebElement checkMasivo = driver.findElement(diagpage.getCheckMasivo());
        checkMasivo.click();
    }

    @And("^acciones Masivas$")
    public void accionesMasivas() {
        WebElement accionesMasivas = driver.findElement(diagpage.getAccionesMasivas());
        accionesMasivas.click();
    }

    @And("^diagnosticar$")
    public void diagnosticar() {
        WebElement diagnosticar = driver.findElement(diagpage.getDiagnosticar());
        diagnosticar.click();
    }

    @And("^instruccion uno$")
    public void instruccion() {
        WebElement instruccion1 = driver.findElement(diagpage.getCorresponde());
        instruccion1.sendKeys("1");
    }

    @And("^no corresponde$")
    public void noCorresponde() {
        WebElement noCorresponde = driver.findElement(diagpage.getNoCorresponde());
        noCorresponde.click();
    }

    @And("^instruccion dos$")
    public void instruccionDos() {
        WebElement instruccion2 = driver.findElement(diagpage.getNoCorresponde());
        instruccion2.sendKeys("2");
    }

    @And("^cerrar sin firma$")
    public void cerrarSinFirma() {
        WebElement cerrarSinFirma = driver.findElement(diagpage.getCerrarSinfirma());
        cerrarSinFirma.click();
    }

    @And("^cerrar con firma$")
    public void cerrarConFirma() {
    }
}




