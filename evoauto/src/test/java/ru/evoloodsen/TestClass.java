package ru.evoloodsen;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ru.evoloodsen.entities.ContactEntity;
import ru.evoloodsen.pages.AddContactPage;
import ru.evoloodsen.pages.MainPage;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 22.04.2025
 */

public class TestClass extends BaseTestClass {

    private static final Logger logger = LoggerFactory.getLogger(TestClass.class);

    private ContactEntity contactEntity;

    private MainPage mainPage;

    @BeforeClass
    public void prepareCondition() {
        contactEntity = new ContactEntity();
        contactEntity.withName("123")
                .withMiddleName("345")
                .withLastName("456");
    }

    @Test
    public void testNavBar() {
        mainPage = loginInSite();
        AddContactPage addContactPage = mainPage.goToAddContactPage();
        addContactPage.fillContactData(contactEntity);
    }

    @AfterClass
    public void afterAction() {
        mainPage.logout();
    }

}
