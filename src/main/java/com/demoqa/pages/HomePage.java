package com.demoqa.pages;

import com.demoqa.pages.forms.FormsPage;
import com.base.BasePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class HomePage extends BasePage {

    private By formCard = By.xpath("//div[@id='app']//h5[text()='Forms']");

    public FormsPage goToForm() {
        scrollToElementJS(formCard);
        click(formCard);
        return new FormsPage();
    }
}
