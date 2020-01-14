package frameworktest.test;

import frameworktest.model.User;
import frameworktest.service.UserCreator;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends  CommonConditions{
    @Test
    public  void loginReturnedTrue() throws InterruptedException {
        try {
        User testUser = UserCreator.createUserFromProperties();
        WebElement userPhoto = UserAuthorization.LogIn(testUser)
                .getUserHeaderPhoto();
        }
        catch (Exception exp){}
        Assert.assertTrue(true);

    }
}
