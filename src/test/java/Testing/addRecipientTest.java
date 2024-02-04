package Testing;


import Classes.addRecipientPage;
import org.testng.annotations.Test;

public class addRecipientTest extends testBase{

    @Test
    public void addRecipient(){
        addRecipientPage add;
        add = new addRecipientPage(driver);

        add.ADDRECIPIENT();

    }
}
