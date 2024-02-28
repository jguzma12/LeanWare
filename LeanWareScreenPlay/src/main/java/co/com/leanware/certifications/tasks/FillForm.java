package co.com.leanware.certifications.tasks;

import co.com.leanware.certifications.userinterfaces.MainPage;
import gherkin.cli.Main;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.locators.WaitForWebElements;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FillForm implements Task {
    private static String name;
    private static String email;

    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
            Click.on(MainPage.BTN_CONTACT_US),
            Enter.theValue(name).into(MainPage.INPUT_NAME),
            Enter.theValue(email).into(MainPage.INPUT_EMAIL),
            Click.on(MainPage.INPUT_TELL_US),
            Click.on(MainPage.BTN_GET_IN_TOUCH)
            );


    }

    public static FillForm with(List<String> data){
        name = data.get(0);
        email= data.get(1);
        return instrumented(FillForm.class);
    }
}
