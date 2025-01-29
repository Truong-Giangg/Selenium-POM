package Test2.com.saucedemo.tests.products;

import Test2.com.saucedemo.base.BaseTest;
import com.saucedemo.pages.ProductsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductTest extends BaseTest {

    @Test
    public void testProductsHeaderIsDisplayed() {
        ProductsPage productsPage = loginPage.logIntoApplication("standard_user", "secret_sauce");

        Assert.assertTrue(productsPage.isProductHeaderDisplayed(), "\n Product Header Is Not Display \n");
    }
}
