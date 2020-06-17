package checkParams;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class paramsWithListener {

    @Test()
    @Parameters("name")
    public void getNameParamFromListner(String name) {
        assertEquals(name, "Jack");
    }

    @Test()
    @Parameters({"name", "baseUrl"})
    public void getNameParamFromsListner(String name, String baseUrl) {
        assertEquals(name, "Jack");

        assertNotEquals(baseUrl, "Jack");
        assertEquals(baseUrl, "https://ultimateqa.com/automation");
    }

}