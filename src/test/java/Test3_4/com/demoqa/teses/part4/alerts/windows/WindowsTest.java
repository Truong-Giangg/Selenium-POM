package Test3_4.com.demoqa.teses.part4.alerts.windows;

import Test3_4.com.demoqa.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import static utilities.GetUtility.getUrl;

public class WindowsTest extends BaseTest {

    @Test
    public void testNewWindowsURL() {
        var windowsPage = homePage.goToAlertsFramesWindowsCard().clickBrowserWindows();
        windowsPage.clickNewWindowsButton();
        windowsPage.switchToNewWindow();
        String actualUrl = getUrl();
        String expectedUrl = "https://demoqa.com/sample";
        Assert.assertEquals(actualUrl, expectedUrl,
                "\nActual & Expected url not match\n");
    }
}
