package module6.patterns;

import module6.patterns.factory.Shape;
import module6.patterns.factory.ShapeFactory;
import module6.patterns.factory.ShapeFactoryImpl;

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
