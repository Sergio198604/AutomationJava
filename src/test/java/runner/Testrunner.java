package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import static cucumber.api.SnippetType.CAMELCASE;

@RunWith(Cucumber.class)

@CucumberOptions(
    features = "src/test/java/features",
        glue = "seleniumgluecode",
        plugin = {"json:test/report/reporte_pvi.json"},
        snippets =  CAMELCASE
)
public class Testrunner {
    @AfterClass
    public static void finish(){

        try{
            System.out.println("Generando reporte");
            String[] cmd = {"cmd.exe", "/c", "npm run report"};
            Runtime.getRuntime().exec(cmd);
            System.out.println("El reporte se generó correctamente");
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}



