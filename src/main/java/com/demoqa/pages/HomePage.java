package com.demoqa.pages;

import com.demoqa.pages.elements.ElementsPage;
import com.demoqa.pages.forms.FormsPage;
import com.base.BasePage;
import com.demoqa.pages.widgets.WidgetsPage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class HomePage extends BasePage {

    private By formCard = By.xpath("//div[@id='app']//h5[text()='Forms']");
    private By elementCard = By.xpath("//div[@id='app']//h5[text()='Elements']");
    private By widgetCard = By.xpath("//div[@id='app']//h5[text()='Widgets']");

    public FormsPage goToForm() {
        scrollToElementJS(formCard);
        click(formCard);
        return new FormsPage();
    }

    public ElementsPage gotoElements () {
        scrollToElementJS(elementCard);
        click(elementCard);
        return new ElementsPage();
    }

    public WidgetsPage gotoWidgets() {
        scrollToElementJS(widgetCard);
        click(widgetCard);
        return new WidgetsPage();
    }
}
