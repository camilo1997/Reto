package co.com.choucair.certification.retoFinal.stepdefinitions;

import co.com.choucair.certification.retoFinal.questions.Answer;
import co.com.choucair.certification.retoFinal.tasks.OpenUp;
import co.com.choucair.certification.retoFinal.tasks.BotonRegistro;
import co.com.choucair.certification.retoFinal.tasks.Registro;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


public class ChoucairAcademyStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^que un usuario quiere registrar sus datos en utest$")
    public void queUnUsuarioQuiereRegistrarSusDatosEnUtest() {
        OnStage.theActorCalled("user").wasAbleTo(OpenUp.thePage(), (BotonRegistro.onThePage()));
    }


    @When("^el usuario registre sus datos$")
    public void elUsuarioRegistreSusDatos() throws Exception{
        OnStage.theActorInTheSpotlight().attemptsTo(Registro.the());
    }

    @Then("^registro sus datos (.*)$")
    public void registroSusDatosCorrectamente(String question) {
        /*OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));*/
    }
}
