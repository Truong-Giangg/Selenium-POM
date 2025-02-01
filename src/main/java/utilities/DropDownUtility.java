package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropDownUtility extends Utility{

    private static Select findDropDown(By locator) {
        return new Select(driver.findElement(locator));
    }

    public static void selectByVisibleText(By locator, String text) {
        findDropDown(locator).selectByVisibleText(text);
    }

    public static void selectByIndex(By locator, int index) {
        findDropDown(locator).selectByIndex(index);
    }

    public static void selectByValue(By locator, String val) {
        findDropDown(locator).selectByValue(val);
    }

    public static void deSelectByVale(By locator, String val) {
        findDropDown(locator).deselectByValue(val);
    }

    public static List<String> getAllSelectedOption(By locator) {
        List< WebElement> allSelectedOption = findDropDown(locator).getAllSelectedOptions();
        return allSelectedOption.stream().map(WebElement::getText).collect(Collectors.toList());
    }
}
