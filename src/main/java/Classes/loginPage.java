package Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;



public class loginPage extends pageBase{
    public loginPage(WebDriver driver) {
        super(driver);
    }


    private final By Email = By.xpath ("//input[@type=\"email\"]");
    private final By Password = By.xpath ("//input[@type=\"password\"]");
    private final By popup = By.xpath("//button[@class=\"btn-transparent\" and text()=\"Cancel\"]");



    public void LOGIN() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(Email).sendKeys("recipient@softxpertdev.com\n");
        driver.findElement(Password).sendKeys("12345678");
        driver.findElement(Password).sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        driver.findElement(popup).click();
    }
}
