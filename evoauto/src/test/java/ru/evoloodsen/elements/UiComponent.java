package ru.evoloodsen.elements;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 29.04.2025
 */

public abstract class UiComponent {

    private final By selfSelector;
    private final SelenideElement element;

    protected UiComponent(By selfSelector) {
        this.selfSelector = selfSelector;
        element = $(selfSelector);
    }

    public By getSelfSelector() {
        return selfSelector;
    }

    public SelenideElement getElement() {
        return element;
    }
}
