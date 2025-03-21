package module3.lesson2.work.exceptions;

import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 14.03.2025
 */

public class ExceptionsClass {

//    1. Создайте три класса Человек, Кот, Робот, которые не наследуются от одного
//    класса. Эти классы должны уметь бегать и прыгать (методы просто выводят
//            информацию о действии в консоль).
//            2. Создайте два класса: беговая дорожка и стена, при прохождении через которые,
//    участники должны выполнять соответствующие действия (бежать или прыгать),
//    результат выполнения печатаем в консоль (успешно пробежал, не смог пробежать
//            и т.д.). У препятствий есть длина (для дорожки) или высота (для стены), а
//    участников ограничения на бег и прыжки.
//            3. Создайте два массива: с участниками и препятствиями, и заставьте всех участников
//    пройти этот набор препятствий. Если участник не смог пройти одно из
//    препятствий, то дальше по списку он препятствий не идет.

    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        try {
            FileReader fr = new FileReader("src/module3/lesson2/exceptions/gitignore.txt");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finaly");
        }

        System.out.println("End Program");

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


    }
}
