package ru.evoloodsen.tests;

import com.github.javafaker.Faker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ru.evoloodsen.BaseTestClass;
import ru.evoloodsen.entities.ContactEntity;
import ru.evoloodsen.pages.AddContactPage;
import ru.evoloodsen.pages.mainPage.MainPage;
import ru.evoloodsen.pages.mainPage.models.ContactTableDto;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 22.04.2025
 */

public class TestClass extends BaseTestClass {

    private static final Logger logger = LoggerFactory.getLogger(TestClass.class);

    private Faker faker = Faker.instance();

    private ContactEntity contactEntity;

    private MainPage mainPage;

    @BeforeClass
    public void prepareCondition() {
        contactEntity = new ContactEntity();
        contactEntity.withName(faker.elderScrolls().firstName())
                .withMiddleName(faker.elderScrolls().race())
                .withLastName(faker.elderScrolls().lastName())
                .withPhoneNumber(String.format("8%s", faker.number().digits(11)))
                .withMobileNumber(String.format("8%s", faker.number().digits(11)))
                .withEmail(String.format("email%s@test.com", faker.number().digits(10)))
                .withBirthDate(LocalDate.of(
                        faker.number().numberBetween(1900, 2025),
                        faker.number().numberBetween(1, 12),
                        faker.number().numberBetween(1, 28)))
                .withAddress1(faker.address().firstName())
                .withAddress2(faker.address().lastName())
                .withCity(faker.address().city())
                .withCountry(faker.address().country())
                .withPostCode(faker.number().digits(6));
    }

    @Test
    public void testCreateContact() {
        mainPage = loginInSite();
        AddContactPage addContactPage = mainPage.goToAddContactPage();
        mainPage = addContactPage.fillContactData(contactEntity).saveContact();

        mainPage.findContact(contactEntity.getEmail());
        ContactTableDto firstContact = mainPage.getContactTable().getFirstTableContact();

        assertThat(firstContact.getName())
                .as("Check Contact FullName")
                .isEqualTo(contactEntity.getFullName());
        assertThat(firstContact.getCity())
                .as("Check Contact City")
                .isEqualTo(contactEntity.getCity());
        assertThat(firstContact.getPhoneNumber())
                .as("Check Contact MobilePhone")
                .isEqualTo(contactEntity.getMobileNumber());
        assertThat(firstContact.getEmail())
                .as("Check Contact Email")
                .isEqualTo(contactEntity.getEmail());

        mainPage.getContactTable().navigateToFirstTableContactPageByRow();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @AfterClass
    public void afterAction() {
        mainPage.logout();
    }

}
