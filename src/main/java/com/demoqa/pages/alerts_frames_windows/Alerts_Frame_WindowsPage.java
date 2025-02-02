package com.demoqa.pages.alerts_frames_windows;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class Alerts_Frame_WindowsPage extends HomePage {

    private By modalDialogsMenuItem = By.xpath("//li[@id='item-4']/span[text()='Modal Dialogs']");
    private By alertMenuItem = By.xpath("//li[@id='item-1']/span[text()='Alerts']");
    private By frameMenuItem = By.xpath("//li[@id='item-2']/span[text()='Frames']");

    public FramesPage clickFrames() {
        scrollToElementJS(frameMenuItem);
        click(frameMenuItem);
        return new FramesPage();
    }
    public AlertsPage clickAlerts() {
        scrollToElementJS(alertMenuItem);
        click(alertMenuItem);
        return new AlertsPage();
    }
    public ModalDialogsPage clickModalDialogs() {
        scrollToElementJS(modalDialogsMenuItem);
        click(modalDialogsMenuItem);
        return new ModalDialogsPage();
    }
}
