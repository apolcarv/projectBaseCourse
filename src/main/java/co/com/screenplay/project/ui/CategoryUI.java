package co.com.screenplay.project.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CategoryUI extends PageObject {

    public static final Target BTN_CLOSE = Target.the("pulsa el boton cerrar del modal del login")
            .located(By.cssSelector("#logInModal > div > div > div.modal-footer > button.btn.btn-secondary"));

    //Localizador dinamico - items categoria
    public static final Target ITEM_CATEGORY = Target.the("Selecciona cualquiera de las tres categoria")
            .locatedBy("//div[@class='list-group']/a[{0}]");

    //Localizador lista - Icard productos

    private static List<WebElement> locatorListProducts() {
        String xpath = "//div[@id='tbodyid']//h4/a[@class='hrefch']";
        return BrowseTheWeb.as(theActorInTheSpotlight()).getDriver().findElements(By.xpath(xpath));
    }

    public static List<WebElement> getLocatorListProducts() {
        return locatorListProducts();
    }

}