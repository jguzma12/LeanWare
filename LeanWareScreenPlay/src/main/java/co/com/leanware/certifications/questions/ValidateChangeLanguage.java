package co.com.leanware.certifications.questions;

import co.com.leanware.certifications.utils.Const;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidateChangeLanguage implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return actor.recall("questionReal").equals(Const.QUESTION_EXPECT);
    }
    public static ValidateChangeLanguage language(){
        return new ValidateChangeLanguage();
    }
}
