package Test3_4.com.demoqa.teses.part3.forms;

import Test3_4.com.demoqa.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonTest extends BaseTest {

    @Test
    public void testRadioButton() {
        var formsPage = homePage.goToForm().clickPracticeForm();
        formsPage.clickFemaleRadioButton();
        boolean isFemaleRadioButtonSelected = formsPage.isFemaleSeleted();
        Assert.assertTrue(isFemaleRadioButtonSelected);
    }
}
