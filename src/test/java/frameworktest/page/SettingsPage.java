package frameworktest.page;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SettingsPage extends BasePage {
    protected SettingsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected BasePage openPage() {
        return null;
    }

    public  SettingsPage inputNewUserName(String userName){
        WebElement inputName = waitForElementLocatedBy(By.xpath("//*[@id='username']"));
        inputName.clear();
        inputName.sendKeys(userName);
        return  this;
    }

    public  SettingsPage inputNewSurname(String surname){
        logger.info("Input user name" + GetLogInfo());
        WebElement inputName = waitForElementLocatedBy(By.xpath("//*[@id='user-name']"));
        inputName.clear();
        inputName.sendKeys(surname);
        return  this;
    }
    public  SettingsPage SaveChanges(){
        logger.info("Save user changes" + GetLogInfo());
        WebElement submitButton = waitForElementLocatedBy(By.xpath("//*[@id='set-data']"));
        submitButton.click();
        return this;
    }

    public  String getSaveChangesMessage(){
        logger.info("Get save changes massage" + GetLogInfo());
        return  waitForElementLocatedBy(By.xpath("//*[@id='profile']/div[12]/div[2]/div")).getText();
    }


}
