package ru.evoloodsen.patterns;

import ru.evoloodsen.patterns.builder.Employee;
import ru.evoloodsen.patterns.facade.Phone;
import ru.evoloodsen.patterns.factory.Shape;
import ru.evoloodsen.patterns.factory.ShapeFactory;
import ru.evoloodsen.patterns.factory.ShapeFactoryImpl;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 25.04.2025
 */

public class PatternStartClass {

    public static void main(String[] args) {
//        Singleton singleton1 = Singleton.getInstance();
//        Singleton singleton2 = Singleton.getInstance();
//        Singleton singleton3 = Singleton.getInstance();

//        Phone phone = new Phone();
//        phone.sendSms();

//        Employee employee = new Employee.Builder()
//                .name("Boris")
//                .hasCar(true).build();
//
//        System.out.println(employee.getAge());

        ShapeFactory shapeFactory = new ShapeFactoryImpl();
        Shape shape  = shapeFactory.renderShape("Human");
        shape.render();
    }
}
