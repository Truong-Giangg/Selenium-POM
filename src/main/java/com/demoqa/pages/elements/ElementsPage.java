package com.demoqa.pages.elements;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

public class ElementsPage extends HomePage {

    private By webTableMenuItem = By.xpath("//li[@id='item-3']//span[text()='Web Tables']");
    private By linkMenuItem = By.xpath("//li[@id='item-5']/span[text()='Links']");

    public WebTablePage clickWebTables () {
        click(webTableMenuItem);
        return new WebTablePage();
    }

    public LinksPage clickLink() {
        click(linkMenuItem);
        return new LinksPage();
    }
}
