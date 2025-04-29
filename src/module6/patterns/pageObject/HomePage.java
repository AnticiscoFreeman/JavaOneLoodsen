package module6.patterns.pageObject;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 25.04.2025
 */

public class HomePage {

    private Combobox accountDataElement;

    public HomePage doSomething() {
        System.out.println("Action on Home Page");
        return this;
    }

    public HomePage fillAccountData(String text) {
        accountDataElement = new Combobox();
//        accountDataElement.fillData(text);
        return this;
    }
}
