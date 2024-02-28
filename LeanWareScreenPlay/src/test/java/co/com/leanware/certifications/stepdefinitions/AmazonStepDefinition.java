package co.com.leanware.certifications.stepdefinitions;

import co.com.leanware.certifications.questions.ValidateChangeLanguage;
import co.com.leanware.certifications.questions.ValidateEmail;
import co.com.leanware.certifications.tasks.FillForm;
import co.com.leanware.certifications.tasks.LanguageChange;
import co.com.leanware.certifications.userinterfaces.AmazonPage;
import co.com.leanware.certifications.utils.Const;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

public class AmazonStepDefinition {
    @Given("^the user enter to the page$")
    public void theUserEnterToThePage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url(Const.URL_AMAZON));
    }

    @When("^the user change the language$")
    public void theUserChangeTheLanguage() {
        OnStage.theActorInTheSpotlight().attemptsTo(LanguageChange.change());

    }

    @Then("^the user should see the page in spanish$")
    public void theUserShouldSeeThePageInSpanish() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateChangeLanguage.language()));

    }

}
