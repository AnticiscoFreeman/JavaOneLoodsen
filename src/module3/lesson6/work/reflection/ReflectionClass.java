package module3.lesson6.work.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 01.04.2025
 */

public class ReflectionClass {

    public static void main(String[] args) throws Exception {

        TestClassWithPrivate testClassWithPrivate = new TestClassWithPrivate(10);
        testClassWithPrivate.info();

        Field privateField = TestClassWithPrivate.class.getDeclaredField("field");
        privateField.setAccessible(true);
        System.out.println("get " + privateField.get(testClassWithPrivate));
        privateField.set(testClassWithPrivate, 500);
        testClassWithPrivate.info();

        Method[] methods = TestClassWithPrivate.class.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            Method currentMethod = methods[i];
            System.out.printf("%s, %s, %s\n", currentMethod.getName(), currentMethod.getReturnType(), Arrays.toString(currentMethod.getParameterTypes()));
        }

//        Method method1 = TestClassWithPrivate.class.getMethod("test");
        Method method2 = TestClassWithPrivate.class.getMethod("test1", int.class);
        System.out.println(method2);

    }
}
