package module6.patterns;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 25.04.2025
 */

public class Singleton {

    private static Singleton instance;

    private Singleton() {
        //...
        System.out.println("This is Construct Singleton");
    }

    public static Singleton getInstance() {
        if (instance == null) {
            System.out.println("Create Singleton");
            instance = new Singleton();
        }
        System.out.println("Exist Singleton");
        return instance;
    }


}
