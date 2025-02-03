package Test3_4.com.demoqa.teses.part4.dynamic_wait;

import Test3_4.com.demoqa.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicWaitTest extends BaseTest {

     @Test
    public void testVisibleAfterButtonText() {

         var dynamicPage = homePage.gotoElements().clickDynamicPropertiesPage();
         String actualText = dynamicPage.getVisibleAfterButtonText();
         String expectedText = "Visible After 5 seconds";
         Assert.assertEquals(actualText, expectedText,
                 "\nActual & Expected Text do not match\n");
     }
     @Test
     public void testProgressBar() {
         var progressPage = homePage.gotoWidgets().clickProgressBar();
         progressPage.clickProgressBar();
         String actualValue = progressPage.getProgressValue();
         String expectedValue = "100%";
         Assert.assertEquals(actualValue, expectedValue,
                 "\nActual & Expected value not match\n");
     }
}
