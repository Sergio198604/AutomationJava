package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Massivediag extends BasePage {

    private By ordendeInspeccion = By.id("orden_inspeccion");
    private By requerimientos = By.name("btnRequerimientos");
    private By checkMasivo = By.xpath("//*[@id=\"tablaRequerimientosInterna\"]/thead/tr/th[1]/div");
    private By accionesMasivas = By.xpath("//*[@id=\"frmReq13\"]/div[1]/div/button");
    private By diagnosticar = By.id("btnDiagnosticarMasivamente");
    private By instruccion1 = By.id("instruccion_37");
    private By noCorresponde = By.id("corresponde_38");
    private By cerrarSinfirma = By.id("opt1_38");
    private By noCorresponde2 = By.id("opt1_39");
    private By cerrarConfirma = By.id("corresponde_39");

    public By getOrdendeInspeccion() {
        return ordendeInspeccion;
    }

    public By getRequerimientos() {
        return requerimientos;
    }

    public By getCheckMasivo() {
        return checkMasivo;
    }

    public By getAccionesMasivas() {
        return accionesMasivas;
    }

    public By getDiagnosticar() {
        return diagnosticar;
    }

    public By getCorresponde() {
        return instruccion1;
    }

    public By getNoCorresponde() {
        return noCorresponde;
    }

    public By getCerrarSinfirma() {
        return cerrarSinfirma;
    }

    public By getCerrarConfirma() {
        return cerrarConfirma;
    }

    public Massivediag(WebDriver driver){
        super(driver);
    }

}
