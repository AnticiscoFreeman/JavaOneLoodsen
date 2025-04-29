package module6.patterns.pageObject;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 25.04.2025
 */

public class WorkClass {

    public static void main(String[] args) {
        LoginPage loginPage = new LoginPage();
        loginPage.fillLogin("LoginUser");
        loginPage.fillPassword("PasswordUser");
        loginPage.login();

        HomePage login = loginPage
                .fillLogin("Login")
                .fillPassword("Password")
                .login();

        login.doSomething()
                .doSomething()
                .fillAccountData("Data");
    }
}
