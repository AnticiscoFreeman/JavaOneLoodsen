package module3.lesson3.work.exceptions;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 14.03.2025
 */

public class Exception3Class {

    private static TestClass testClass1;
    private static TestClass2ForNPE testClass2;

    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        testClass1 = new TestClass();
        testClass2 = new TestClass2ForNPE();

        testClass1.doSomething();
        testClass2.walk();

//        FileReader fr = new FileReader("src/module3/lesson3/work/test1.txt");

        //        try {
//            driver.findBy("").click();
//        } catch (NoSuchElementException e) {
//            tgBot.send();
//        }

//        try {
//            System.out.println(a/b);
//            System.out.println("try 1");
//
//        } catch (ArithmeticException e ) {
//            System.out.println(e.fillInStackTrace());
//        } catch (NoSuchElementException e) {
//
//        }

//            myUniversalMethod(new CowObject());
//        myCustomExceptionMethod();
//        System.out.println("End Program");


    }

//    private static void myUniversalMethod(Object obj) throws IOException,
//            FileNotFoundException,
//            NoSuchElementException,
//            StackOverflowError
//    {
//        //...
//        FileReader fr = new FileReader("src/module3/lesson3/work/test1.txt");
//        if (obj == new CowObject()) {
//            throw new MyCustomException();
//        }
//        //...
//
//    }
//
//    private static void myCustomExceptionMethod(){
//        System.out.println("myCustomExceptionMethod");
//        try {
//            throw new MyCustomException();
//        } catch (MyCustomException e) {
//            throw new RuntimeException(e);
//        }
//    }
}
