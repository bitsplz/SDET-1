
package testscripts;

import org.testng.annotations.Test;
import pages.LoginPage;

public class Login extends TestBase {
    @Test
    public void testLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("testuser");
        loginPage.enterPassword("password123");
        loginPage.clickLogin();
    }
}
