package checkParams;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class withParams {
    @Test()
    @Parameters({"driver", "password"})
    public void checkingWithParamsFromXml(String driver, String password) {
        assertEquals(driver, "selenuimGrid");
        assertEquals(password, "12345");
    }

    @Test()
    @Parameters({"driverOne", "passwordOne"})
    public void checkingWithOption(@Optional("sa") String driverOne, @Optional("sa") String passwordOne) {
        assertEquals(driverOne, "sa");
        assertEquals(passwordOne, "sa");
    }
}