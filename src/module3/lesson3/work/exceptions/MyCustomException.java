package module3.lesson3.work.exceptions;

import module3.lesson2.interfaces.CowObject;

import java.io.IOException;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 18.03.2025
 */

public class MyCustomException extends IOException {

    private CowObject cowObject;

    public MyCustomException() {
        super();
        System.out.println("Hello from MyCustomException");
        this.cowObject = new CowObject();
    }
}
