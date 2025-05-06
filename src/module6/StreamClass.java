package module6;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 06.05.2025
 */

public class StreamClass {

    public static class TextClass {
        private int testValue;

        public TextClass(int testValue) {
            this.testValue = testValue;
        }

        public int getTestValue() {
            return testValue;
        }
    }

    public static void main(String[] args) {


        List<String> stringArray = new ArrayList<>();
        stringArray.add("1");
        stringArray.add("2");
        stringArray.add("3");
        stringArray.add("4");
        stringArray.add("5");
        stringArray.add("3");

        for (int i = 0; i < stringArray.size(); i++) {
            if (stringArray.get(i).equals("3")) {
                System.out.println("Found " + stringArray.get(i));
            }
        }

        String first = stringArray.stream()
                .filter(item -> item.equals("3"))
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException());

        List<TextClass> textClasses = new ArrayList<>();
        textClasses.add(new TextClass(5));
        textClasses.add(new TextClass(4));
        textClasses.add(new TextClass(3));
        textClasses.add(new TextClass(2));
        textClasses.add(new TextClass(1));
        textClasses.add(new TextClass(5));

        textClasses.stream().map(TextClass::getTestValue).toList();
    }
}
