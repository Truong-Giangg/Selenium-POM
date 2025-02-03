package com.demoqa.pages.elements;

import org.openqa.selenium.By;

import static utilities.GetUtility.getText;
import static utilities.WaitUtility.explicitWaitUntilVisible;

public class DynamicPropertiesPage extends ElementsPage{

    private By visileAfterButton = By.id("visibleAfter");

    public String getVisibleAfterButtonText() {
        explicitWaitUntilVisible(5, visileAfterButton);
        String visibleText = getText(visileAfterButton);
        System.out.println("button text: "+ visibleText);
        return visibleText;
    }
}
