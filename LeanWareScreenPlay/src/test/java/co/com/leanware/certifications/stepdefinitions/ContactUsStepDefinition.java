package co.com.leanware.certifications.stepdefinitions;

import co.com.leanware.certifications.questions.ValidateAnswer;
import co.com.leanware.certifications.questions.ValidateEmail;
import co.com.leanware.certifications.tasks.FillForm;
import co.com.leanware.certifications.utils.Const;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class ContactUsStepDefinition {
    @Managed
    WebDriver driver;

    @Before
    public void setup() {
        OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(driver)));
        OnStage.theActorCalled("Actor");
    }


    @Given("^the user enter the page$")
    public void theUserEnterThePage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url(Const.URL_LEANWARE));

    }


    @When("^the user fill wrong the inputs$")
    public void theUserFillWrongTheInputs(List<String> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(FillForm.with((data)));

    }

    @Then("^the user should see an error message stating (.*)$")
    public void theUserShouldSeeAnErrorMessageStating(String msg) {
    OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateEmail.with(), Matchers.is(msg)));

    }

    @Then("^the user should see this error message stating (.*)$")
    public void theUserShouldSeeThisErrorMessageStatingEnterAnAnswer(String msg) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateAnswer.with(), Matchers.is(msg)));
    }
}
