package ru.evoloodsen.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.evoloodsen.BaseClass;
import ru.evoloodsen.components.PagePopup;
import ru.evoloodsen.pages.LoginPage;
import ru.evoloodsen.pages.MainPage;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 22.04.2025
 */

public class TestLoginPage extends BaseClass {

    private LoginPage loginPage;

    @Test
    public void testLoginAndLogoutSite() {
        loginPage = new LoginPage();
        String nonLoginPopupMessage = loginPage.getAlertPopupText();
        Assert.assertEquals(nonLoginPopupMessage, PagePopup.NON_LOGIN_MESSAGE);

        MainPage mainPage = loginPage.enterLoginData(ADMIN_LOGIN)
                .enterPasswordData(ADMIN_PASSWORD)
                .pressLogin();

        String successPopupMessage = mainPage.getAlertPopupText();
        String successPopupColor = mainPage.getSuccessPopupColor();

        Assert.assertEquals(successPopupMessage, PagePopup.SUCCESS_POPUP_TEXT);
        Assert.assertEquals(successPopupColor, PagePopup.SUCCESS_POPUP_COLOR);

        loginPage = mainPage.logout();

        String logoutPopupMessage = loginPage.getAlertPopupText();
        Assert.assertEquals(logoutPopupMessage, PagePopup.LOGOUT_POPUP_TEXT);
    }

}
