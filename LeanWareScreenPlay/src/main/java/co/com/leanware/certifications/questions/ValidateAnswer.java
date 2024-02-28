package co.com.leanware.certifications.questions;

import co.com.leanware.certifications.userinterfaces.MainPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidateAnswer implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        actor.remember("msgReal", MainPage.TEXT_TELL_US.resolveFor(actor).getText());
        return actor.recall("msgReal");
    }
    public static ValidateAnswer with() {
        return new ValidateAnswer();
    }
}
