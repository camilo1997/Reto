package co.com.choucair.certification.retoFinal.userinterface;

        import net.serenitybdd.screenplay.targets.Target;
        import org.openqa.selenium.By;

public class UtestRegistroPage {
    public static final Target REGISTER_BUTTON = Target.the("boton que lleva al registro nuevo")
            .located(By.className("unauthenticated-nav-bar__sign-up"));

}
