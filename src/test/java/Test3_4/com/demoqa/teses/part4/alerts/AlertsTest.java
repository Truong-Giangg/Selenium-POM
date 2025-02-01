package Test3_4.com.demoqa.teses.part4.alerts;

import Test3_4.com.demoqa.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import static utilities.SwitchToUtility.acceptAlert;
import static utilities.SwitchToUtility.getAlertText;

public class AlertsTest extends BaseTest {

    @Test
    public void testInformationAlert() {
        String alertText = "You clicked a button";
        var alertPage = homePage.goToAlertsFramesWindowsCard().clickAlerts();
        alertPage.clickInformationAlertButton();
        Assert.assertEquals(getAlertText(), alertText,
                "\n Actual & Expected Message Do Not Match\n");
        acceptAlert();
    }
}
