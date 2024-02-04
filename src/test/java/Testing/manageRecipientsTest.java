package Testing;

import Classes.manageRecipientsPage;
import org.testng.annotations.Test;

public class manageRecipientsTest extends testBase{
    @Test
    public void Recipient(){
        manageRecipientsPage r;
        r = new manageRecipientsPage(driver);

        r.GOTOMANAGERECIPIENTS();

    }

}
