package checkParams;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Locale;

import static org.testng.AssertJUnit.assertEquals;

public class paramsWithDataProvider {
    @DataProvider
    public Object[][] parseLocaleData() {
        return new Object[][]{
                {"ru_RU_some_variant", new Locale("ru", "RU", "some_variant")},
        };
    }

    @Test(dataProvider = "parseLocaleData")
    public void checkWithDataProvider(String locale, Locale expected) {
        assertEquals(expected, new Locale("ru", "RU", "some_variant"));
        assertEquals(locale, "ru_RU_some_variant");
    }

}