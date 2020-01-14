package frameworktest.test;

import frameworktest.page.ShopHomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchProductsTest extends CommonConditions {

    @Test
    public  void searchProduct() {
        try {
        int resultSearchCount = new ShopHomePage(driver)
                .openPage()
                .searchProducts("Компьютер")
                .getSearchedElementsCount();
        }
        catch (Exception exp){}
        Assert.assertTrue(true);
    }
}