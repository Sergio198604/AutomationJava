package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OiPage extends BasePage {

  private By buscador =By.id("buscar");
  private By btnBuscar = By.xpath("//*[@id=\"ClickBuscar\"]");
  private By prmrReq = By.xpath("//*[@id=\"prop1435\"]/td[4]/button[2]");
  private By primerReq = By.xpath("//*[@id=\"ingresarPrimerRequerimiento\"]/div/div/div[2]/a");
  private By descripcionProblema = By.id("r_descripcion");
  private By guardarReq = By.id("btnGuardaReq");
  private By segReq = By.xpath("//*[@id=\"div_ver_req\"]/div/div/div[1]/div[1]/a");
  private By vistaPrevia = By.id("vp");
  private By checkProp = By.id("divProp");
  private By checkCopia = By.xpath("//*[@id=\"divCC\"]/label");
  private By copiaMail = By.id("mailCopia");
  private By btnEnvio = By.xpath("/html/body/div[12]/div/div[2]/form/div[2]/div/button");
  private By envioFinal = By.xpath("/html/body/div[14]/div/div[3]/div[2]/div/button");

    public By getBuscador() {
        return buscador;
    }

    public By getBtnBuscar() {
        return btnBuscar;
    }

    public By getPrmrReq() {
        return prmrReq;
    }

    public By getPrimerReq() {
        return primerReq;
    }

    public By getDescripcionProblema() {
        return descripcionProblema;
    }

    public By getGuardarReq() {
        return guardarReq;
    }

    public By getSegReq() {
        return segReq;
    }

    public By getVistaPrevia() {
        return vistaPrevia;
    }

    public By getCheckProp() {
        return checkProp;
    }

    public By getCheckCopia() {
        return checkCopia;
    }

    public By getCopiaMail() {
        return copiaMail;
    }

    public By getBtnEnvio() {
        return btnEnvio;
    }

    public By getEnvioFinal() {
        return envioFinal;
    }

    public OiPage(WebDriver driver){
        super(driver);
    }

}
