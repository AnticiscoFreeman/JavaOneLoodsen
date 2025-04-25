package ru.evoloodsen.patterns.pageObject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebElement;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 25.04.2025
 */

public class Combobox {

    private SelenideElement self;

    private SelenideElement label;
    private SelenideElement input;

    public Combobox() {
        self.shouldHave(Condition.visible);
    }

    public void fillData(String text) {
        input.click();
        input.sendKeys(text);
    }

    public String getLabel() {
        return label.getText();
    }

}
