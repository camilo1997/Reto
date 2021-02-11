package co.com.choucair.certification.retoFinal.questions;

import co.com.choucair.certification.retoFinal.userinterface.UtestFormularioRegistroPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {
    private String question;

    public Answer(String question) {
        this.question = question;
    }

    public static Answer toThe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String confirm = Text.of(UtestFormularioRegistroPage.REGISTER_CONFIRM).viewedBy(actor).asString();
        if (question.equals(confirm)){
            result = true;
        }else{
            result = false;
        }
        return result;
    }


}
