package gui;

import core.BaseDriver;
import core.BaseMethods;
import gui.pages.HeaderOneTypePage;
import gui.pages.HeaderTwoTypePage;
import helpers.Print;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.io.IOException;

import static com.codeborne.selenide.Selenide.open;
import static core.BaseMethods.*;
import static core.BaseMethods.baseUrl;
import static org.testng.Assert.assertTrue;
import static org.testng.AssertJUnit.assertEquals;

public class TestNG extends BaseDriver implements BaseMethods {
    @Test
    @Parameters("baseUrl")
    public void openingPage(String baseUrl) throws IOException {
        Print.i(baseUrl);
        open(baseUrl());

        assertEquals(currentUrl(), baseUrl());
    }

    @Test
    public void checkingHeader() throws IOException {
        open(baseUrl());
        HeaderTwoTypePage page = PageFactory.initElements(currentDriver(), HeaderTwoTypePage.class);

        assertTrue(page.headerBlock().exists());
    }

    @Test
    public void checkingHeaderExist() throws IOException {
        HeaderOneTypePage page = open(baseUrl(), HeaderOneTypePage.class);

        assertTrue(page.headerBlock.exists());
    }

    @Test
    @Parameters("baseUrl")
    public void checkingHeaderTitle(String baseUrl) {
        HeaderOneTypePage page = open(baseUrl, HeaderOneTypePage.class);

        assertEquals(page.title.getText(), "Automation Practice");
    }
}