package Test3_4.com.demoqa.teses.part3.elements;

import Test3_4.com.demoqa.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebTableTest extends BaseTest {

    @Test
    public void testWebTable() {
        String email = "alden@example.com";
        var webTablePage = homePage.gotoElements().clickWebTables();
        webTablePage.clickEdit(email);
        webTablePage.setAge("34");
        webTablePage.clickSubmitButton();
        String actualAge = webTablePage.getTableAge(email);
        String expectedAge = "34";
        Assert.assertEquals(actualAge, expectedAge, "\n Actual & Expected do not match \n");
    }
}
