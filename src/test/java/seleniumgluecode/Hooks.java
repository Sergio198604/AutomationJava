package seleniumgluecode;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import runner.browser_manager.DriverManager;
import runner.browser_manager.DriverManagerFactory;
import runner.browser_manager.DriverType;

import java.util.concurrent.TimeUnit;

public class Hooks {

    private static WebDriver driver;
    private static int numberofCase = 0;
    private DriverManager driverManager;

    @Before
    public void SetUp() throws InterruptedException {
        numberofCase ++;
        System.out.println("Se está ejecutando el escenario nro: " + numberofCase);
        driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
        driver = driverManager.getDriver();
        driver.get("http://10.33.51.209/automation/index2.php");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

   @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
            byte[] screenshoot = ((TakesScreenshot)driverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshoot,"image/png");
        }
        System.out.println("El escenario nro: " + numberofCase + " se ejecuto correctamente");
        driverManager.quitDriver();
    }

    public static WebDriver getDriver(){
        return driver;
    }

}
