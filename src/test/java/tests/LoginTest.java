package tests;

import base.BaseTest;
import org.testng.annotations.*;
import pages.LoginPage;
import utils.ConfigReader;

public class LoginTest extends BaseTest {

    LoginPage loginPage;

    @BeforeMethod
    public void setupTest() {
        setUp();
        loginPage = new LoginPage(page);
    }

    @Test
    public void verifyLogin() {
        loginPage.navigate(ConfigReader.get("url"));
        loginPage.login("admin", "password");
    }

    @AfterMethod
    public void tearDownTest() {
        tearDown();
    }
}
