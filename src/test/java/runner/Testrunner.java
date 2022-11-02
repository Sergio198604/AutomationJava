package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import utils.LogHelper;
import java.util.logging.Level;
import java.util.logging.Logger;

import static cucumber.api.SnippetType.CAMELCASE;

@RunWith(Cucumber.class)

@CucumberOptions(
    features = "src/test/java/features",
        glue = "seleniumgluecode",
        plugin = {"json:test/report/reporte_pvi.json"},
        snippets =  CAMELCASE
)
public class Testrunner {

    private static final Logger LOGGER = LogHelper.getLogger();
    @AfterClass
    public static void finish(){
        try{
            LOGGER.log(Level.INFO, "Generando reporte..." );
            String[] cmd = {"cmd.exe", "/c", "npm run report"};
            Runtime.getRuntime().exec(cmd);
            LOGGER.log(Level.INFO, "El reporte se generó correctamente");
        }catch (Exception ex){
            LOGGER.log(Level.WARNING, "No se pudo generar el reporte");
            ex.printStackTrace();
        }
    }
}



