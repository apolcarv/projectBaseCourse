package co.com.screenplay.project.hook;

import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.util.EnvironmentVariables;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenWeb implements Task {

    private EnvironmentVariables environmentVariables;

    public OpenWeb(String webUrl) {
        this.webUrl = webUrl;
    }

    private String webUrl;

    @Override
    @Step("{0} abre el navegador web")
    public <T extends Actor> void performAs(T actor) {
        String pathWebUrl = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty(webUrl);
        actor.attemptsTo(Open.url(pathWebUrl));
    }

    public static Performable browserURL(String webUrl) {
        return instrumented(OpenWeb.class, webUrl);
    }
}