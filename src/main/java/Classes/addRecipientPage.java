package Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class addRecipientPage extends pageBase {
    public addRecipientPage(WebDriver driver) {
        super(driver);
    }


    private final By addRecipient = By.xpath("//button[contains(@class, 'btn-blue') and contains(., 'Add Recipient')]\n");
    private final By firstName = By.xpath("/html/body/modal-container/div/div/app-add-edit-alias/app-modal/div[2]/div/div/form/form-textbox/div/div/div[1]/input");
    private final By lastName = By.xpath("/html/body/modal-container/div/div/app-add-edit-alias/app-modal/div[2]/div/div/form/div[5]/form-textbox/div/div/div[1]/input");
    //private final By addButton = By.xpath("/html/body/modal-container/div/div/app-add-edit-alias/app-modal/div[3]/div/button[1]");
    private final By bes = By.xpath("/html/body/modal-container/div/div/app-add-edit-alias/app-modal/div[2]/div/div/form/div[2]/label");
    private final By besName = By.xpath("/html/body/modal-container/div/div/app-add-edit-alias/app-modal/div[2]/div/div/form/form-textbox/div/div/div/input");


    public void ADDRECIPIENT() {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",driver.findElement(addRecipient));
        /*driver.findElement(bes).click();
        driver.findElement(besName).sendKeys("Islam");
        driver.findElement(besName).sendKeys(Keys.ENTER);*/
        driver.findElement(firstName).sendKeys("Islam");
        driver.findElement(lastName).sendKeys("Ibrahim");
        driver.findElement(lastName).sendKeys(Keys.ENTER);

    }
}
