package Test3_4.com.demoqa.teses.part3.elements;

import Test3_4.com.demoqa.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LinkTest extends BaseTest {

    @Test
    public void testLink() {
        var linkPage = homePage.gotoElements().clickLink();
        linkPage.clickBadRequestLink();
        String actualResponse = linkPage.getResponseLink();
        Assert.assertTrue(actualResponse.contains("400")&&actualResponse.contains("Bad Request"),
                "\n Actual Response (" + actualResponse +
                ")\n Does not contain '400' and 'Bad Request'\n");
    }
}
