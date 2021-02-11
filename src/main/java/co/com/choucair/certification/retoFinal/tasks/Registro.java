package co.com.choucair.certification.retoFinal.tasks;

import co.com.choucair.certification.retoFinal.userinterface.UtestFormularioRegistroPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class Registro implements Task {
    public static Registro the() {
        return Tasks.instrumented(Registro.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("Camilo").into(UtestFormularioRegistroPage.INPUT_FIRST_NAME),
                Enter.theValue("lopera").into(UtestFormularioRegistroPage.INPUT_LAST_NAME),
                Enter.theValue("camilolopera1@gmail.com").into(UtestFormularioRegistroPage.INPUT_EMAIL),
                SelectFromOptions.byVisibleText("August").from(UtestFormularioRegistroPage.DROP_DOWN_LIST_MONTH),
                SelectFromOptions.byVisibleText("29").from(UtestFormularioRegistroPage.DROP_DOWN_LIST_DAY),
                SelectFromOptions.byVisibleText("1997").from(UtestFormularioRegistroPage.DROP_DOWN_LIST_YEAR),
                Click.on(UtestFormularioRegistroPage.LANGUAGE),
                Enter.theValue("Spanish").into(UtestFormularioRegistroPage.LANGUAGE),
                Click.on(UtestFormularioRegistroPage.SELECT_LANGUAGE),
                Click.on(UtestFormularioRegistroPage.BUTTON_NEXT),
                Click.on(UtestFormularioRegistroPage.SELECT_CITY),
                Enter.theValue("050015").into(UtestFormularioRegistroPage.INPUT_CODE_POSTAL),
                Click.on(UtestFormularioRegistroPage.INPUT_COUNTRY),
                Enter.theValue("Colombia").into(UtestFormularioRegistroPage.INPUT_COUNTRYS),
                Click.on(UtestFormularioRegistroPage.SELECT_COUNTRY),
                Click.on(UtestFormularioRegistroPage.BUTTON_NEXT2),
                Click.on(UtestFormularioRegistroPage.INPUT_SYSTEM),
                Enter.theValue("Windows").into(UtestFormularioRegistroPage.INPUT_SYSTEMS),
                Click.on(UtestFormularioRegistroPage.SELECT_SYSTEM),
                Click.on(UtestFormularioRegistroPage.INPUT_VERSION),
                Enter.theValue("Windows 10 Home").into(UtestFormularioRegistroPage.INPUT_VERSIONS),
                Click.on(UtestFormularioRegistroPage.SELECT_VERSION),
                Click.on(UtestFormularioRegistroPage.INPUT_LANGUAGES),
                Enter.theValue("Spanish").into(UtestFormularioRegistroPage.INPUT_LANGUAGESS),
                Click.on(UtestFormularioRegistroPage.SELECT_LANGUAGES),
                Click.on(UtestFormularioRegistroPage.INPUT_MOBILE),
                Enter.theValue("Xiaomi").into(UtestFormularioRegistroPage.INPUT_MOBILES),
                Click.on(UtestFormularioRegistroPage.SELECT_MOBIL),
                Click.on(UtestFormularioRegistroPage.INPUT_MODEL),
                Enter.theValue("MI 9T").into(UtestFormularioRegistroPage.INPUT_MODELS),
                Click.on(UtestFormularioRegistroPage.SELECT_MODEL),
                Click.on(UtestFormularioRegistroPage.INPUT_SYSTEM_MOBILE),
                Enter.theValue("Android 10").into(UtestFormularioRegistroPage.INPUT_SYSTEM_MOBILES),
                Click.on(UtestFormularioRegistroPage.SELECT_SYSTEM_MOBILE),
                Click.on(UtestFormularioRegistroPage.BUTTON_NEXT3),
                Enter.theValue("A123789456a*").into(UtestFormularioRegistroPage.INPUT_PASSWORD),
                Enter.theValue("A123789456a*").into(UtestFormularioRegistroPage.INPUT_CONFIRM_PASSWORD),
                Click.on(UtestFormularioRegistroPage.CHECKBOX_EMAIL),
                Click.on(UtestFormularioRegistroPage.CHECKBOX_TERMS),
                Click.on(UtestFormularioRegistroPage.CHECKBOX_PRIVACY),
                Click.on(UtestFormularioRegistroPage.BUTTON_REGISTER)
                
                );
    }
}
