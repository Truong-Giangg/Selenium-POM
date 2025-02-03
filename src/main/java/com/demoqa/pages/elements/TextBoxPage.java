package com.demoqa.pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import static utilities.ActionsUtility.sendKeys;
import static utilities.GetUtility.getText;
import static utilities.JavaScriptUtility.scrollToElementJS;
import static utilities.WaitUtility.explicitWaitUntilVisible;

public class TextBoxPage extends ElementsPage{

    private By fullNameField = By.id("userName");
    private By currentAddressField = By.xpath("//textarea[@id = 'currentAddress']");
    private By submitButton = By.id("submit");
    private By currentAddressResult = By.xpath("//p[@id='currentAddress']");

    public String getCurrentAddress() {
        explicitWaitUntilVisible(5, currentAddressResult);
        return getText(currentAddressResult);
    }

    public void clickSubmitButton() {
        click(submitButton);
    }

    public void setCurrentAddressField(String address) {
        find(currentAddressField).sendKeys(address +Keys.ENTER);
    }
    public void setFullNameField(String name) {
        scrollToElementJS(fullNameField);
//        Actions act = new Actions(driver);
//        act.sendKeys(find(fullNameField), Keys.chord(name)).perform();
        sendKeys(find(fullNameField), Keys.chord(name));

    }

    public void setEmail(String email) {
        setFullNameField(Keys.chord(Keys.TAB, email));
    }
}
