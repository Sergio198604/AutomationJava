package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

  private String titleHomePage ="PVI - Login";
  private By nombredeUsuario = By.id("user");
  private By contraseñaUsuario = By.id("pass");
  private By ingreso = By.id("ingresar");

    public String getTitleHomePage(){
        return titleHomePage;
    }

    public By getNombredeUsuario() {
        return nombredeUsuario;
    }

    public By getContraseñaUsuario() {
        return contraseñaUsuario;
    }

    public By getIngreso() {
        return ingreso;
    }

    public HomePage(WebDriver driver){
        super(driver);
    }
}
