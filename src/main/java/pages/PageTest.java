package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.annotations.Name;
import ru.alfabank.alfatest.cucumber.annotations.Optional;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;

@Name("Pages")
public class PageTest extends AkitaPage {
    @Optional
    @Name("title")
    @FindBy(css = "title")
    public SelenideElement title;

    @Optional
    @Name("header")
    @FindBy(css = "#header")
    public SelenideElement header;

    @Optional
    @Name("body")
    @FindBy(css = "#body")
    public SelenideElement body;

    @Optional
    @Name("main right")
    @FindBy(css = "#main_right")
    public SelenideElement mainRight;

    @Optional
    @Name("sidebar left")
    @FindBy(css = "#sidebar_left")
    public SelenideElement sidebarLeft;
}
