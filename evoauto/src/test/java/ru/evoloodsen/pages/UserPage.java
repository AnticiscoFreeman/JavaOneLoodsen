package ru.evoloodsen.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.evoloodsen.components.NavigationBar;
import ru.evoloodsen.components.PagePopup;
import ru.evoloodsen.elements.UiComponentFactory;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 29.04.2025
 */

public class UserPage {
    private static final Logger logger = LoggerFactory.getLogger(UserPage.class);

    private static final By NAVIGATION_BAR = By.cssSelector("nav[data-testid='navbar']");
    private static final By NAV_BAR_BUTTON = By.cssSelector("li[data-testid='navbar_item']");

    public UserPage() {
        logger.info("Navigate to UserPage");
    }

}
