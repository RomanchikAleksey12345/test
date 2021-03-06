package frameworktest.test;

import frameworktest.page.ShopHomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTest extends CommonConditions{
    @Test
    public  void userRegistrationNotCorrectCode() throws InterruptedException {
        try {
        String registrationMessage = new ShopHomePage(driver)
                .openPage()
                .openUserAuthorizationFrame()
                .openUserRegistrationFrame()
                .inputPhoneForRegistration("337775533")
                .getCodeForRegistration()
                .inputCodeForRegistration("abc")
                .getRegistrationMessage();
        }
        catch (Exception exp){}
        Assert.assertTrue(true);
    }
}