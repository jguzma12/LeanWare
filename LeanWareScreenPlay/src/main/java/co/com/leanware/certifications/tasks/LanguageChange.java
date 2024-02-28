package co.com.leanware.certifications.tasks;

import co.com.leanware.certifications.interactions.Wait;
import co.com.leanware.certifications.userinterfaces.AmazonPage;
import cucumber.api.java.tr.Ama;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LanguageChange implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(AmazonPage.BTN_LANGUAGE),
                Click.on(AmazonPage.BTN_LANGUAGE_SPANISH),
                Wait.theSeconds(2)
        );
        actor.remember("questionReal",AmazonPage.TEXT_QUESTIONS.resolveFor(actor).getText());
    }
    public static LanguageChange change(){
        return new LanguageChange();
    }
}
