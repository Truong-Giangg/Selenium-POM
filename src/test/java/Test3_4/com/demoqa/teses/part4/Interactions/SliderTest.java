package Test3_4.com.demoqa.teses.part4.Interactions;

import Test3_4.com.demoqa.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SliderTest extends BaseTest {

    @Test
    public void testSliderResult() {
        int x = 180;
        int y = 0;
        var sliderPage = homePage.gotoWidgets().clickSlider();
        sliderPage.moveSlider(x, y);
        String actualValue = sliderPage.getSliderValue();
        String expectedValue = "95";
        Assert.assertEquals(actualValue, expectedValue,
                "\nActual & Expected value does not match\n");
    }
}
