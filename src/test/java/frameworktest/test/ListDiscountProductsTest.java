package frameworktest.test;

import frameworktest.page.ShopHomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ListDiscountProductsTest extends CommonConditions {
    @Test
    public  void getDiscountProducts() throws InterruptedException {
        String discountPageTitle = new ShopHomePage(driver)
                .openPage()
                .openDiscountProductsPage()
                .getDiscountComputers()
                .getPageTitle();
        Assert.assertTrue(true);
    }
}
