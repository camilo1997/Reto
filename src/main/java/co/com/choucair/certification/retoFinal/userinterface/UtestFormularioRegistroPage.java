package co.com.choucair.certification.retoFinal.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestFormularioRegistroPage {
    public static final Target INPUT_FIRST_NAME = Target.the("Donde se escribe el nombre")
            .located(By.id("firstName"));
    public static final Target INPUT_LAST_NAME = Target.the("Donde se escribe el apellido")
            .located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("Donde se escribe el correo")
            .located(By.id("email"));
    public static final Target DROP_DOWN_LIST_MONTH = Target.the("Donde se selecciona el mes")
            .located(By.id("birthMonth"));
    public static final Target DROP_DOWN_LIST_DAY = Target.the("Donde se selecciona el dia")
            .located(By.id("birthDay"));
    public static final Target DROP_DOWN_LIST_YEAR = Target.the("Donde se selecciona el AÑo")
            .located(By.id("birthYear"));
    public static final Target LANGUAGE = Target.the("Donde se busca el idioma")
            .located(By.xpath("//div[@id='languages']/div/input"));
    public static final Target SELECT_LANGUAGE = Target.the("Donde se selecciona el idioma")
            .located(By.xpath("//div[@id='ui-select-choices-row-0-0']/span/div"));
    public static final Target BUTTON_NEXT = Target.the("Boton siguiente formulario")
            .located(By.xpath("//section[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[2]/a"));
    public static final Target SELECT_CITY = Target.the("Donde se selecciona la ciudad")
            .located(By.xpath("//section[@id='regs_container']/div/div[2]/div/div[2]/div/form/div/div[3]/div/div"));
    public static final Target INPUT_CODE_POSTAL = Target.the("Donde se coloca el codigo postal")
            .located(By.id("zip"));
    public static final Target INPUT_COUNTRY = Target.the("Donde se coloca el pais")
            .located(By.xpath("//section[@id='regs_container']/div/div[2]/div/div[2]/div/form/div/div[3]/div/div[4]/div[2]/div/div/div/span/span[2]"));
    public static final Target INPUT_COUNTRYS = Target.the("Donde se busca el pais")
            .located(By.xpath("//section[@id='regs_container']/div/div[2]/div/div[2]/div/form/div/div[3]/div/div[4]/div[2]/div/div/input"));
    public static final Target SELECT_COUNTRY = Target.the("Donde se selecciona el pais")
            .located(By.cssSelector(".ui-select-choices-row-inner > div"));
    public static final Target BUTTON_NEXT2 = Target.the("Boton siguiente formulario")
            .located(By.xpath("//section[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[2]/div/a"));
    public static final Target INPUT_SYSTEM= Target.the("Donde se coloca el sistema")
            .located(By.xpath("//div[@id='web-device']/div/div[2]/div/div/span/span[2]"));
    public static final Target INPUT_SYSTEMS = Target.the("Donde se busca el sistema")
            .located(By.xpath("//div[@id='web-device']/div/div[2]/div/input"));
    public static final Target SELECT_SYSTEM = Target.the("Donde se selecciona el sistema")
            .located(By.cssSelector(".ui-select-choices-row-inner > div"));
    public static final Target INPUT_VERSION= Target.the("Donde se coloca la version")
            .located(By.xpath("//div[@id='web-device']/div[2]/div[2]/div/div/span"));
    public static final Target INPUT_VERSIONS = Target.the("Donde se busca version")
            .located(By.xpath("//div[@id='web-device']/div[2]/div[2]/div/input"));
    public static final Target SELECT_VERSION = Target.the("Donde se selecciona la version")
            .located(By.cssSelector(".ui-select-highlight"));
    public static final Target INPUT_LANGUAGES= Target.the("Donde se coloca el lenguaje")
            .located(By.xpath("//div[@id='web-device']/div[3]/div[2]/div/div/span/span"));
    public static final Target INPUT_LANGUAGESS = Target.the("Donde se busca el lenguaje")
            .located(By.xpath("//div[@id='web-device']/div[3]/div[2]/div/input"));
    public static final Target SELECT_LANGUAGES= Target.the("Donde se selecciona el lenguaje")
            .located(By.cssSelector(".ui-select-choices-row-inner > div"));
    public static final Target INPUT_MOBILE= Target.the("Donde se coloca el movil")
            .located(By.xpath("//div[@id='mobile-device']/div/div[2]/div/div/span/span"));
    public static final Target INPUT_MOBILES = Target.the("Donde se busca el movil")
            .located(By.xpath("//div[@id='mobile-device']/div/div[2]/div/input"));
    public static final Target SELECT_MOBIL= Target.the("Donde se selecciona el movil")
            .located(By.cssSelector(".ui-select-choices-row-inner > div"));
    public static final Target INPUT_MODEL= Target.the("Donde se coloca el modelo")
            .located(By.xpath("//div[@id='mobile-device']/div[2]/div[2]/div/div/span/span"));
    public static final Target INPUT_MODELS = Target.the("Donde se busca el modelo")
            .located(By.xpath("//div[@id='mobile-device']/div[2]/div[2]/div/input"));
    public static final Target SELECT_MODEL= Target.the("Donde se selecciona el modelo")
            .located(By.cssSelector(".ui-select-highlight"));
    public static final Target INPUT_SYSTEM_MOBILE= Target.the("Donde se coloca el sistema")
            .located(By.xpath("//div[@id='mobile-device']/div[3]/div[2]/div/div/span"));
    public static final Target INPUT_SYSTEM_MOBILES = Target.the("Donde se busca el sistema")
            .located(By.xpath("//div[@id='mobile-device']/div[3]/div[2]/div/input"));
    public static final Target SELECT_SYSTEM_MOBILE= Target.the("Donde se selecciona el sistema")
            .located(By.cssSelector(".ui-select-highlight"));
    public static final Target BUTTON_NEXT3 = Target.the("Boton siguiente formulario")
            .located(By.xpath("//section[@id='regs_container']/div/div[2]/div/div[2]/div/div[2]/div/a"));
    public static final Target INPUT_PASSWORD= Target.the("Donde se ingresa la contraseña")
            .located(By.id("password"));
    public static final Target INPUT_CONFIRM_PASSWORD= Target.the("Donde confirma la contraseña")
            .located(By.id("confirmPassword"));
    public static final Target CHECKBOX_EMAIL= Target.the("Donde se confirma recibir correos de informacion ")
            .located(By.xpath("//section[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[4]/label/span"));
    public static final Target CHECKBOX_TERMS= Target.the("Donde se confirman los terminos")
            .located(By.xpath("//section[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[5]/label/span"));
    public static final Target CHECKBOX_PRIVACY= Target.the("Donde confirman las politicas y privacidad")
            .located(By.xpath("//section[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[6]/label/span"));
    public static final Target BUTTON_REGISTER= Target.the("boton de registro de usuario")
            .located(By.id("laddaBtn"));
    public static final Target REGISTER_CONFIRM = Target.the("confirmacion de registro")
            .located(By.xpath("//a[contains(@href, 'https://www.utest.com/welcome?from=signup')]"));


}
