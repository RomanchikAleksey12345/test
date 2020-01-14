package frameworktest.page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FaceBookPage extends  BasePage  {

    protected final String FACEBOOK_URL = "https://www.facebook.com/shopby/";

    protected FaceBookPage(WebDriver driver) {
        super(driver);
        driver.get(FACEBOOK_URL);
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS);
    }

    @Override
    protected BasePage openPage() {
        logger.info("Open face book page" + GetLogInfo());
        driver.get(FACEBOOK_URL);
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS);
        return  this;
    }

    public String getLogo(){
        logger.info("Get logo" + GetLogInfo());
        return waitForElementLocatedBy(By.xpath("//*[@id=\"blueBarDOMInspector\"]/div/div/div/div[1]/h1/a/i")).getText();
    }
}
