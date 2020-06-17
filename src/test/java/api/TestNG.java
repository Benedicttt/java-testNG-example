package api;

import core.BaseDriver;
import core.BaseMethods;
import org.testng.annotations.Test;

import java.io.IOException;

import static com.codeborne.selenide.Selenide.open;
import static core.BaseMethods.baseUrl;
import static core.BaseMethods.currentUrl;
import static org.testng.Assert.assertEquals;

public class TestNG extends BaseDriver implements BaseMethods {
//    @Test
//    public void openingPage() throws IOException {
//        open(baseUrl());
//
//        assertEquals(currentUrl(), baseUrl());
//    }
}