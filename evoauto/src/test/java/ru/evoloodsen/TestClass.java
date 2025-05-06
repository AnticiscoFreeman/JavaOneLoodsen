package ru.evoloodsen;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ru.evoloodsen.components.PagePopup;
import ru.evoloodsen.entities.ContactEntity;
import ru.evoloodsen.pages.AddContactPage;
import ru.evoloodsen.pages.LoginPage;
import ru.evoloodsen.pages.LogsPage;
import ru.evoloodsen.pages.MainPage;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 22.04.2025
 */

public class TestClass extends BaseClass {

    private static final Logger logger = LoggerFactory.getLogger(TestClass.class);

    private ContactEntity contactEntity;

    @BeforeClass
    public void prepareCondition() {
        contactEntity = new ContactEntity();
        contactEntity.withName("123")
                .withMiddleName("345")
                .withLastName("456");
    }

    @Test
    public void testNavBar() throws InterruptedException {
        MainPage mainPage = loginInSite();
        AddContactPage addContactPage = mainPage.goToAddContactPage();
        Thread.sleep(2000);
        addContactPage.fillContactData(contactEntity);
        Thread.sleep(2000);
    }

}
