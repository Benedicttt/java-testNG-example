package api;

import helpers.Request;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.*;

public class TestNG {
    private Response response;

    @BeforeClass
    @Parameters("baseUrlAPI")
    public void response(String baseUrlAPI) throws IOException {
        response = Request.call(baseUrlAPI, null);
    }

    @Test
    public void statusCode() {
        assertEquals(response.statusCode(), 200);
    }
}