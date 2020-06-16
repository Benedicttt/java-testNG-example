package steps;

import cucumber.api.java.en.When;
import ru.alfabank.steps.BaseMethods;

import static com.codeborne.selenide.Selenide.open;
import static ru.alfabank.alfatest.cucumber.ScopedVariables.resolveVars;
import static ru.alfabank.tests.core.helpers.PropertyLoader.loadProperty;

public class Steps extends BaseMethods {
    @When("^opened page \"([^\"]*)\"$")
    public void goToSelectedPageByLink(String urlOrName) {
        String address = loadProperty(urlOrName, resolveVars(urlOrName));
        akitaScenario.write(" url = " + address);
        open(address);
    }
}
