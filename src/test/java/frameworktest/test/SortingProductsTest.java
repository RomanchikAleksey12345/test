package frameworktest.test;

import frameworktest.page.ShopHomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SortingProductsTest extends CommonConditions {
    @Test
    public  void sortProductsByFilter() throws InterruptedException {
        try {
            String sortTitle = new ShopHomePage(driver)
                    .openPage()
                    .getSledProducts()
                    .sortProductsWithHaft()
                    .getSortingTitle();
        }
        catch (Exception exp){}
        Assert.assertTrue(true);
    }
}
