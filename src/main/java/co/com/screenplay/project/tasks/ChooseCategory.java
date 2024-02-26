package co.com.screenplay.project.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static co.com.screenplay.project.ui.CategoryUI.*;
import static co.com.screenplay.project.utils.Constants.TIME_SHORT;
import static co.com.screenplay.project.utils.Random.randomNumberTwoAndFour;
import static co.com.screenplay.project.utils.Time.waiting;

public class ChooseCategory implements Task {

    @Override
    @Step("{0} selecciona una categoria de forma aletoria")
    public <T extends Actor> void performAs(T actor) {

        String randomCategory = String.valueOf(randomNumberTwoAndFour());

        actor.attemptsTo(Click.on(BTN_CLOSE),
                Click.on(ITEM_CATEGORY.of("3")));
        waiting(TIME_SHORT);


    }

    public static ChooseCategory dynamic() {
        return Tasks.instrumented(ChooseCategory.class);
    }
}
