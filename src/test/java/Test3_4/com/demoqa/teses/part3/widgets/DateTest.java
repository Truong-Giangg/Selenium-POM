package Test3_4.com.demoqa.teses.part3.widgets;

import Test3_4.com.demoqa.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DateTest extends BaseTest {

    @Test
    public void testSelectingDate() {
        String month = "December";
        String monthNumber = "11";
        String day = "30";
        String year = "2034";
        var datePickerPage = homePage.gotoWidgets().clickDatePicker();
        datePickerPage.clickSelectDate();
        datePickerPage.selectMonth(month);
        datePickerPage.selectYear(year);
        datePickerPage.clickDay(day);

        String actualDate = datePickerPage.getDate();
        String expectedDate = monthNumber + "/" + day + "/" + year;

        Assert.assertEquals(actualDate, expectedDate, "\nActual date & Expect Dates Do not match:\n" +
                "\n ActualDate:" + actualDate +
                "\n ExpectedDate" + expectedDate);
    }
}
