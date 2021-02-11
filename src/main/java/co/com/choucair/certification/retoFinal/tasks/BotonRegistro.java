package co.com.choucair.certification.retoFinal.tasks;

import co.com.choucair.certification.retoFinal.userinterface.UtestRegistroPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class BotonRegistro implements Task {
    public static BotonRegistro onThePage() {
        return Tasks.instrumented(BotonRegistro.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestRegistroPage.REGISTER_BUTTON));
    }
}
