package Test3_4.com.demoqa.teses.part4.Interactions;

import Test3_4.com.demoqa.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class KeyboardTest extends BaseTest {

    @Test
    public void testApplicationUsingKeyboard() {
        var textBoxPage = homePage.gotoElements().clickTextBoxPage();
        textBoxPage.setFullNameField("Rex Lapis I");
        textBoxPage.setEmail("Rex123@gmail.com");
        textBoxPage.setCurrentAddressField("138 hoang hoa tham");
        textBoxPage.setCurrentAddressField("phuong 12");
        textBoxPage.setCurrentAddressField("Binh Thanh, TPHCM");
        textBoxPage.clickSubmitButton();
        String actualAddress = textBoxPage.getCurrentAddress();
        Assert.assertTrue(actualAddress.contains("138 hoang hoa tham"),
                "\nActual address does not contain 128 hoang hoa tham\n");
    }

}
