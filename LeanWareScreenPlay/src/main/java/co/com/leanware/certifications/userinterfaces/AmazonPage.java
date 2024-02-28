package co.com.leanware.certifications.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class AmazonPage {
    public static final Target BTN_LANGUAGE = Target.the("Btn for change language").
            locatedBy("//*[@data-test='language-dropdown']");
    public static final Target BTN_LANGUAGE_SPANISH = Target.the("Btn for change language to spanish").
            locatedBy("//*[@data-test='language-select-es']");
    public static final Target TEXT_QUESTIONS = Target.the("text from the page").
            locatedBy("//*[@data-test='menu-questions']");

}
