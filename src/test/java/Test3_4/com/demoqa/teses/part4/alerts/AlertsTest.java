package Test3_4.com.demoqa.teses.part4.alerts;

import Test3_4.com.demoqa.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import static utilities.SwitchToUtility.*;

@Test
public class AlertsTest extends BaseTest {


    public void testInformationAlert() {
        String alertText = "You clicked a button";
        var alertPage = homePage.goToAlertsFramesWindowsCard().clickAlerts();
        alertPage.clickInformationAlertButton();
        Assert.assertEquals(getAlertText(), alertText,
                "\n Actual & Expected Message Do Not Match\n");
        acceptAlert();
    }

    public void testConfirmationAlert() {
        String expectedConfirmationResult = "You selected Cancel";
        var alertsPage = homePage.goToAlertsFramesWindowsCard().clickAlerts();
        alertsPage.clickConfirmationAlertButton();
        dismissAlert();
        String actualConfirmationResult = alertsPage.getConfirmationResult();
        Assert.assertEquals(actualConfirmationResult, expectedConfirmationResult,
                "\n You did not select Cancel\n");
    }
}
