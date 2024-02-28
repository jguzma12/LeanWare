package co.com.leanware.certifications.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class MainPage {
    public static final Target BTN_CONTACT_US = Target.the("Btn contact us").
            locatedBy("(//*[@data-testid='stylablebutton-label'])[1]");
    public static final Target BTN_GET_IN_TOUCH = Target.the("Btn get in touch").
            locatedBy("(//*[@data-testid='stylablebutton-label'])[1]");
    public static final Target INPUT_NAME = Target.the("input for name").
            locatedBy("//*[@id='form-field-input-8eb302eb-d1d1-4784-ab0c-b043820d0576']");
    public static final Target INPUT_EMAIL = Target.the("input for email").
            locatedBy("//*[@id='form-field-input-37274bb7-95a4-40a5-430b-fe940c1ffac1']");
    public static final Target INPUT_TELL_US = Target.the("input for tell us").
            locatedBy("//*[@id='form-field-input-ec56f152-7a85-4f85-d098-ebe96cc55048']");
    public static final Target TEXT_EMAIL = Target.the("msg wrong email").
            locatedBy("//*[@id='form-field-error-37274bb7-95a4-40a5-430b-fe940c1ffac1']");
    public static final Target TEXT_TELL_US = Target.the("msm wrong comment").
            locatedBy("//*[@id='form-field-error-ec56f152-7a85-4f85-d098-ebe96cc55048']");
}
