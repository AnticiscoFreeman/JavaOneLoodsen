package ru.evoloodsen.pages;

import ru.evoloodsen.components.NavigationBar;
import ru.evoloodsen.elements.UiComponentFactory;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 06.05.2025
 */

public class BasePage {

    protected NavigationBar navigationBar = UiComponentFactory.createNavigationBar(NavigationBar.SELF);

    public NavigationBar getNavigationBar() {
        return navigationBar;
    }

    public LoginPage logout() {
        return navigationBar.clickLogoutButton();
    }

    public MainPage goToAddressBookPage() {
        return navigationBar.clickAddressBookButton();
    }

    public UserPage goToUserPage() {
        return navigationBar.clickUserButton();
    }

    public LogsPage goToLogsPage() {
        return navigationBar.clickLogsButton();
    }

    public ApiPage goToApiPage() {
        return navigationBar.clickApiButton();
    }
}
