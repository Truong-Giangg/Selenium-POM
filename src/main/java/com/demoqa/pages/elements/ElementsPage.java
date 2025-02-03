package com.demoqa.pages.elements;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class ElementsPage extends HomePage {

    private By webTableMenuItem = By.xpath("//li[@id='item-3']//span[text()='Web Tables']");
    private By linkMenuItem = By.xpath("//li[@id='item-5']/span[text()='Links']");
    private By dynamicPropertiesMenuItem = By.xpath("//li[@id='item-8']/span[text()='Dynamic Properties']");

    public DynamicPropertiesPage clickDynamicPropertiesPage() {
        scrollToElementJS(dynamicPropertiesMenuItem);
        click(dynamicPropertiesMenuItem);
        return new DynamicPropertiesPage();
    }

    public WebTablePage clickWebTables () {
        click(webTableMenuItem);
        return new WebTablePage();
    }

    public LinksPage clickLink() {
        click(linkMenuItem);
        return new LinksPage();
    }
}
