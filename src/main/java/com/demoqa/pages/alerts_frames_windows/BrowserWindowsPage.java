package com.demoqa.pages.alerts_frames_windows;

import org.openqa.selenium.By;

import java.util.Set;

import static utilities.SwitchToUtility.switchToWindow;

public class BrowserWindowsPage extends Alerts_Frame_WindowsPage {

    private By newWindowsButton = By.id("windowButton");

    public void clickNewWindowsButton() {
        click(newWindowsButton);
    }

    public void switchToNewWindow() {
        // Step 1: Get The Current "Main" Windows handle
        String currentHandle = driver.getWindowHandle();
        System.out.println("Current Windoes Handles: " + currentHandle);
        // Step 2: Get All Window Handles
        Set<String> allHandles = driver.getWindowHandles();
        System.out.println("# of Open Windows: " + allHandles.size());

        for(String handle : allHandles) {
            if (currentHandle.equals(handle)) {
                System.out.println("1st window ID: " +handle);
            } else {
                switchToWindow(handle);
                System.out.println("2nd window ID: "+ handle);
            }
        }
    }
}
