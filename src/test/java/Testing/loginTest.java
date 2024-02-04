package Testing;

import Classes.loginPage;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class loginTest extends testBase {

    @Test
    public void login() throws InterruptedException {
        loginPage l;
        l = new loginPage(driver);

        //login
        l.LOGIN();
    }
}
