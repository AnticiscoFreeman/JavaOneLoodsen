package module3.lesson4.home;

import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeSet;

/**
 * 1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
 * Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
 * Посчитать, сколько раз встречается каждое слово.
 * 2. Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров.
 * В этот телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода get()
 * искать номер телефона по фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов
 * (в случае однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.
 * Желательно не добавлять лишний функционал (дополнительные поля (имя, отчество, адрес),
 * взаимодействие с пользователем через консоль и т.д).
 * Консоль использовать только для вывода результатов проверки телефонного справочника.
 */

public class CollectionsHome {

    private static final String[] words = {"A", "A", "B", "B", "B", "C", "C", "C", "C", "D"};

    private static TreeSet<String> getWords(String[] array) {
        return new TreeSet<>(Arrays.asList(array));
    }

    private static HashMap<String, Integer> getWordsCount(String[] array) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            String word = array[i];
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }
        return map;
    }

    public static void main(String[] args) {
        System.out.println(getWords(words));
        System.out.println(getWordsCount(words));

        Phonebook phonebook = new Phonebook();
        phonebook.add("Ivanov", "ivanov-phone-1", "ivanov-mail-1");
        phonebook.add("Petrov", "petrov-phone-1", "petrov-mail-1");
        phonebook.add("Ivanov", "ivanov-phone-2", "ivanov-mail-2");
        phonebook.add("Ivanov", "ivanov-phone-1", "ivanov-mail-1");

        System.out.println("e-mail Ivanov: " + phonebook.getMails("Ivanov"));
        System.out.println("e-mail Petrov: " + phonebook.getMails("Petrov"));
        System.out.println("phone Ivanov: " + phonebook.getPhones("Ivanov"));
        System.out.println("phone Petrov: " + phonebook.getPhones("Petrov"));
    }
}
