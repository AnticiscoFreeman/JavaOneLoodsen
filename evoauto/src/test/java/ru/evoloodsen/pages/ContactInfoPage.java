package ru.evoloodsen.pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 29.04.2025
 */

public class ContactInfoPage extends BasePage {
    private static final Logger logger = LoggerFactory.getLogger(ContactInfoPage.class);

    public static final By TITLE = By.cssSelector("h2");
    public static final String TITLE_VALUE = "%s - View Contact";

    public ContactInfoPage(String contactName) {
        logger.info("Navigate to {}", contactName);
        $(TITLE).shouldHave(Condition.visible).shouldHave(Condition.text(String.format(TITLE_VALUE, contactName)));
    }

}
