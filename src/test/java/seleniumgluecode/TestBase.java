package seleniumgluecode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pom.HomePage;
import pom.Massivediag;
import pom.OiPage;

public class TestBase {

    protected WebDriver driver = Hooks.getDriver();
    protected HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    protected OiPage oipage = PageFactory.initElements(driver, OiPage.class);
    protected Massivediag diagpage = PageFactory.initElements(driver, Massivediag.class);
}
