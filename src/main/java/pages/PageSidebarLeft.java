package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.annotations.Name;
import ru.alfabank.alfatest.cucumber.annotations.Optional;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;

@Name("SidebarLeft")
public class PageSidebarLeft extends AkitaPage {
    @Optional
    @Name("Overview")
    @FindBy(css = "#nav_dom_top")
    public SelenideElement nav_dom_top;

    @Optional
    @Name("Root Zone Management")
    @FindBy(css = "#nav_dom_root")
    public SelenideElement nav_dom_root;

    @Optional
    @Name(".INT Registry")
    @FindBy(css = "#nav_dom_int")
    public SelenideElement nav_dom_int;

    @Optional
    @Name(".ARPA Registry")
    @FindBy(css = "#nav_dom_arpa")
    public SelenideElement nav_dom_arpa;

    @Optional
    @Name("IDN Practices Repository")
    @FindBy(css = "#nav_dom_idn")
    public SelenideElement nav_dom_idn;

    @Optional
    @Name("Root Key Signing Key (DNSSEC)")
    @FindBy(css = "#nav_dom_dnssec")
    public SelenideElement nav_dom_dnssec;


    @Optional
    @Name("Reserved Domains")
    @FindBy(css = "#nav_dom_special")
    public SelenideElement nav_dom_special;
}
