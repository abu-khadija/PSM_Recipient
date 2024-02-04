package Testing;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

public class testBase {

    public static WebDriver driver;


    @BeforeSuite
    public void OpenBrowser(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://app-beta.postscanmail.com/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }


   /* @AfterSuite
    public void CloseDriver(){
        driver.quit();
    }*/
}
