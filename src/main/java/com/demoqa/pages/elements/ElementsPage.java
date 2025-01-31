package com.demoqa.pages.elements;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

public class ElementsPage extends HomePage {

    private By webTableMenuItem = By.xpath("//li[@id='item-3']//span[text()='Web Tables']");

    public WebTablePage clickWebTables () {
        click(webTableMenuItem);
        return new WebTablePage();
    }
}
