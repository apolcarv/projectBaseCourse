package co.com.screenplay.project.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginUI extends PageObject {

    /**
     * Mapeo de localozadores vista LOGIN
     */

    public static final Target MODAL_LOGIN = Target.the("selecciona en el modal la opcion login")
            .located(By.id("login2"));

    public static final Target INPUT_USER_NAME = Target.the("ingresa el nombre de usuario")
            .located(By.id("loginusername"));

    public static final Target INPUT_PASSWORD = Target.the("ingresa la contraseña")
            .located(By.id("loginpassword"));

    public static final Target BUTTON_LOGIN = Target.the("pulsa el boton entrar")
            .located(By.xpath("//button[@onclick='logIn()']"));

}