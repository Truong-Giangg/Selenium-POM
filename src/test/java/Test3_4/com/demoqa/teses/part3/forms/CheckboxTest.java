package Test3_4.com.demoqa.teses.part3.forms;

import Test3_4.com.demoqa.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckboxTest extends BaseTest {

    @Test
    public void testCheckBox() {
        var formsPage = homePage.goToForm().clickPracticeForm();
        formsPage.clickSportCheckbox();
        formsPage.clickMusicCheckbox();
        formsPage.clickReadingCheckbox();
        formsPage.unclickReadingCheckbox();

        boolean isReadingCheckboxSeleted = formsPage.isReadingSelected();
        Assert.assertFalse(isReadingCheckboxSeleted, "\n Reading checkbox is seleted \n");
    }
}
