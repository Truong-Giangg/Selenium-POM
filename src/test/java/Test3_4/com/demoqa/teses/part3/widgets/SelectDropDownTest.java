package Test3_4.com.demoqa.teses.part3.widgets;

import Test3_4.com.demoqa.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SelectDropDownTest extends BaseTest {

    @Test
    public void testMultiSelectDropDown() {
        var selectMenuPage = homePage.gotoWidgets().clickSelectMenu();
        selectMenuPage.selectStandardMulti("Volvo");
        selectMenuPage.selectStandardMulti(1);
        selectMenuPage.selectStandardMulti("Audi");
        selectMenuPage.selectStandardMulti(2);

        selectMenuPage.deselectStandardMulti("saab");
        List<String> actualSelectedOption = selectMenuPage.getAllSelectedStandardMultiOptions();
        Assert.assertTrue(actualSelectedOption.contains("Volvo"));
        Assert.assertTrue(actualSelectedOption.contains("Audi"));
        Assert.assertTrue(actualSelectedOption.contains("Opel"));
        Assert.assertFalse(actualSelectedOption.contains("Saab"), "\n Saab Is Selected As An Option \n");

    }
}
