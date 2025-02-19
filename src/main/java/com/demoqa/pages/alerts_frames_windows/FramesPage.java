package com.demoqa.pages.alerts_frames_windows;

import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;
import static utilities.SwitchToUtility.*;
import static utilities.WaitUtility.explicitWaitUntilVisible;

public class FramesPage extends Alerts_Frame_WindowsPage{

    private By textInFrame = By.id("sampleHeading");
    private String iFrameBigBox = "frame1";
    private By headerFramesText = By.xpath("//div[@id='app']//h1[text()='Frames']");
    private By frameSmallBox = By.xpath("//div[@id='frame2Wrapper']/iframe");
    private final int BIG_BOX_FRAME_INDEX = 2;

    public String getHeaderFramesText() {
        return find(headerFramesText).getText();
    }
    private void switchToBigBox() {
        switchToFramesString(iFrameBigBox);
    }

    private void switchToSmallBox() {
        switchToFrameIndex(BIG_BOX_FRAME_INDEX); // small box get issue
    }

    private void switchToSmallBoxByElement() {
        switchToFrameElement(find(frameSmallBox));
    }

    public String getTextInBigFrame() {
        switchToBigBox();
        String bigFrameText = find(textInFrame).getText();
        System.out.println("Big Frame Text" + bigFrameText);
        switchToDefaultContent();
        return bigFrameText;
    }

    public String getTextInSmallFrame() {
        switchToSmallBox();
        explicitWaitUntilVisible(5, textInFrame);
        String smallFrameText = find(textInFrame).getText();
        System.out.println("Small Frame Text" + smallFrameText);
        switchToDefaultContent();
        return smallFrameText;
    }

    public String getTextInSmallFrameElement() {
        switchToSmallBoxByElement();
        explicitWaitUntilVisible(5, textInFrame);
        String smallFrameText = find(textInFrame).getText();
        System.out.println("Small Frame Text" + smallFrameText);
        switchToDefaultContent();
        return smallFrameText;
    }


}
