package Test3_4.com.demoqa.teses.part4.screenshot;

import Test3_4.com.demoqa.base.BaseTest;
import org.testng.annotations.Test;

public class CaptureFailedScreenShotTest extends BaseTest {

    @Test
    public void testClinkingSubmitButtonWithoutJSExecutor() {
        var practiceFormPage = homePage.goToForm().clickPracticeForm();
        practiceFormPage.clickSubmitButton();
    }
}
