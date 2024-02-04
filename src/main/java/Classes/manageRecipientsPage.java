package Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.security.Key;

public class manageRecipientsPage extends pageBase{
    public manageRecipientsPage(WebDriver driver) {
        super(driver);
    }

    private final By settingsIcon = By.xpath("//a[@class='header-link-settings' and @routerlink='/settings']");
    private final By manageRecipient = By.xpath("//a[@class='ng-tns-c101-26' and @routerlink='/settings/manage-recipients']\n");







    public void GOTOMANAGERECIPIENTS(){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",driver.findElement(settingsIcon));
        js.executeScript("arguments[0].click();",driver.findElement(manageRecipient));
    }

}
