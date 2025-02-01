package Test3_4.com.demoqa.teses.part4.modals;

import Test3_4.com.demoqa.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ModalTest extends BaseTest {

    @Test
    public void testModalDialog() {
        var afwPage = homePage.goToAlertsFramesWindowsCard();
        var modalDialogPage = afwPage.clickModalDialogs();

        modalDialogPage.clickSmallModalButton();
        String actualText = modalDialogPage.getSmallModelText();
        Assert.assertTrue(actualText.contains("small modal"),
                "\nThe Message Does Not Contain Small Modal\n");

    }
}
