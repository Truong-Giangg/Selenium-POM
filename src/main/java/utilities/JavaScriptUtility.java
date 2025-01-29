package utilities;

import org.openqa.selenium.*;

public class JavaScriptUtility extends Utility{

    public static void scrollToElementJS(By locator) {
         WebElement element = driver.findElement(locator);
         String jsScript = "arguments[0].scrollIntoView();";
        ((JavascriptExecutor)driver).executeScript(jsScript, element);
    }
}
