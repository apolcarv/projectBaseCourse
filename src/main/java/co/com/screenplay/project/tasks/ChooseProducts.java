package co.com.screenplay.project.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import static co.com.screenplay.project.utils.Constants.TIME_SHORT;
import static co.com.screenplay.project.utils.SelectorElements.selectRandomProducts;
import static co.com.screenplay.project.utils.Time.waiting;

public class ChooseProducts implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        selectRandomProducts();
        waiting(TIME_SHORT);

    }
    public static ChooseProducts dynamic(){
        return Tasks.instrumented(ChooseProducts.class);
    }
}
