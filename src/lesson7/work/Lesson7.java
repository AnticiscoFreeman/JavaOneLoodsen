package lesson7.work;

import java.util.Scanner;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 18.02.2025
 */

public class Lesson7 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        String string1 = "Hello Java!";
//        String string2 = "Hello";
//        string2 += " Java!"; //string2 = string2 + " Java!"
//
//        String string3 = scanner.nextLine();
//        String string4 = "Hello Java!";
//
//        System.out.println("string1 > " + string1);
//        System.out.println("string2 > " + string2);
//        System.out.println("string3 > " + string3);
//        System.out.println("string4 > " + string4);
//        System.out.println("==========================");
//        System.out.println("String 1 == String 2 > " + (string1 == string2));
//        System.out.println("String 1 == String 3 > " + (string1 == string3));
//        System.out.println("String 1 == String 4 > " + (string1 == string4));
//        System.out.println("==========================");
//        System.out.println("String 1 == String 2 > " + (string1.equals(string2)));
//        System.out.println("String 1 == String 3 > " + (string1.equals(string3)));
//        System.out.println("String 1 == String 4 > " + (string1.equals(string4)));

        String tmp1 = "String";

        long start = System.nanoTime();

        for (int i = 0; i < 80000; i++) {
            tmp1+= i;
        }

        float delta1 = System.nanoTime() - start;

        StringBuilder stringBuilder = new StringBuilder("String");

        start = System.nanoTime();
        for (int i = 0; i < 80000; i++) {
            stringBuilder.append(i);
        }

        float delta2 = System.nanoTime() - start;

        System.out.println("Delta1 = " + delta1 * 0.000001f + " milliseconds");
        System.out.println("Result1 > " + tmp1);

        System.out.println("Delta2 = " + delta2 * 0.000001f + " milliseconds");
        System.out.println("Result2 > " + stringBuilder.toString());

    }
}
