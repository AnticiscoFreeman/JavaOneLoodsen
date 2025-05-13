package ru.evoloodsen.entities;

import ru.evoloodsen.tools.DateHelper;

import java.time.LocalDate;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 06.05.2025
 */

public class ContactEntity {
    private String name;
    private String middleName;
    private String lastName;
    private String phoneNumber;
    private String mobileNumber;
    private String email;
    private LocalDate birthDate;
    private String address1;
    private String address2;
    private String city;
    private String country;
    private String postCode;

    public ContactEntity withPostCode(String data) {
        this.postCode = data;
        return this;
    }

    public ContactEntity withCountry(String data) {
        this.country = data;
        return this;
    }

    public ContactEntity withCity(String data) {
        this.city = data;
        return this;
    }

    public ContactEntity withAddress2(String data) {
        this.address2 = data;
        return this;
    }

    public ContactEntity withAddress1(String data) {
        this.address1 = data;
        return this;
    }

    public ContactEntity withBirthDate(LocalDate data) {
        this.birthDate = data;
        return this;
    }

    public ContactEntity withEmail(String data) {
        this.email = data;
        return this;
    }

    public ContactEntity withPhoneNumber(String data) {
        this.phoneNumber = data;
        return this;
    }

    public ContactEntity withMobileNumber(String data) {
        this.mobileNumber = data;
        return this;
    }

    public ContactEntity withName(String data) {
        this.name = data;
        return this;
    }

    public ContactEntity withMiddleName(String data) {
        this.middleName = data;
        return this;
    }

    public ContactEntity withLastName(String data) {
        this.lastName = data;
        return this;
    }

    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getFullAddress() {
        //            Adrianne, Cronin, Cristobalshire, Gambia, 153662
        return String.format("%s, %s, %s, %s, %s",
                address1, address2, city, country, postCode);
    }

    public String getMonthYearBirthDate() {
        return DateHelper.transformLocalDateToString(birthDate, DateHelper.MONTH_YEAR_DATE_PATTERN);
    }

    public String getAddress1() {
        return address1;
    }

    public String getAddress2() {
        return address2;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getPostCode() {
        return postCode;
    }

    public String getFullName() {
        return String.format("%s %s %s", name, middleName, lastName);
    }
}
