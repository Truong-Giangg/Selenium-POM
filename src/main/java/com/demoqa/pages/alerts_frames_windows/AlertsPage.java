package com.demoqa.pages.alerts_frames_windows;

import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.clickJS;
import static utilities.JavaScriptUtility.scrollToElementJS;

public class AlertsPage extends Alerts_Frame_WindowsPage{
    private By informationAlertButton = By.id("alertButton");
    private By confirmAlertButton = By.id("confirmButton");
    private By confirmResult = By.id("confirmResult");

    public void clickInformationAlertButton() {
        scrollToElementJS(informationAlertButton);
        click(informationAlertButton);
    }

    public void clickConfirmationAlertButton() {
        click(confirmAlertButton);
    }

    public String getConfirmationResult() {
        return find(confirmResult).getText();
    }

}
