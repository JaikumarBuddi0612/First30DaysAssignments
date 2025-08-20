package Hooks;

import Driver.Driver;
import Utils.Log;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;

public class Hooks {
    @Before
    public void before() {
        Log.info("Driver Initialized and parabank index page opened");
        Driver.getDriver().navigate().to("https://parabank.parasoft.com/parabank/index.htm");
    }
    @After
    public void after() {
        Driver.getDriver().close();
        Driver.getDriver().quit();
        Log.info("Driver Closed");
    }
}
