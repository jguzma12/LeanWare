package co.com.leanware.certifications.questions;

import co.com.leanware.certifications.userinterfaces.MainPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidateEmail implements Question{
    @Override
    public Object answeredBy(Actor actor) {
        actor.remember("msgReal", MainPage.TEXT_EMAIL.resolveFor(actor).getText());
        return actor.recall("msgReal");
    }

    public static ValidateEmail with() {
        return new ValidateEmail();
    }
}
