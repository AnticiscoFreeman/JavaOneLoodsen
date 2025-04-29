package ru.evoloodsen.elements;

import org.openqa.selenium.By;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 29.04.2025
 */

public class PagePopup extends UiComponent {

    public static final By SELF = By.cssSelector("div[role='alert']");

    public PagePopup(By selfSelector) {
        super(selfSelector);
    }
}
