package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import ru.alfabank.steps.BaseMethods;

import java.util.ArrayList;

import static com.codeborne.selenide.Selenide.open;
import static com.jayway.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static ru.alfabank.alfatest.cucumber.ScopedVariables.resolveVars;
import static ru.alfabank.tests.core.helpers.PropertyLoader.loadProperty;

public class Steps extends BaseMethods {
    private Response response;

    @When("^opened page \"([^\"]*)\"$")
    public void goToSelectedPageByLink(String urlOrName) {
        String address = loadProperty(urlOrName, resolveVars(urlOrName));
        akitaScenario.write(" url = " + address);
        open(address);
    }

    @And("^(GET|POST|PUT|DELETE) request to URL \"([^\"]*)\" has been executed.$")
    public void sendHttpRequestWithoutParams(String method, String address) {
        response = sendRequest(method, address, new ArrayList<>());
    }

    @Then("^Check JSON schema current response$")
    public void expectedResponseCode() {
        response.then().assertThat().body(matchesJsonSchemaInClasspath("schema/example.json"));
    }
}
