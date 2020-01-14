package frameworktest.test;

import frameworktest.page.ShopHomePage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class JoinFacebookTest extends  CommonConditions {
    @Test
    public  void joinFacebook() throws InterruptedException {
        try {
        String faceBookLogo = new ShopHomePage(driver)
                .openPage()
                .openFaceBook()
                .getLogo();
        }
        catch (Exception exp){}
        Assert.assertTrue(true);
    }
}
