package module3.lesson4.work;

import module3.lesson4.work.maps.KeyMap;
import module3.lesson4.work.maps.ValueMap;

import java.util.*;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 21.03.2025
 */

public class CollectionsLesson {

    public static void main(String[] args) {
        workWithIterator();
    }

    private static void workWithIterator() {
        Set<String> set = new HashSet<>();
        set.add("One");
        Iterator<String> iterator = set.iterator();

        List<String> list = new ArrayList<>();
        Iterator<String> iterator1 = list.iterator();
        list.listIterator().add("");
    }

    private static void workWithLists() {
        ArrayList<String> word = new ArrayList<>();
        word.add("One");
        word.add("Two");
        word.add("Three");
        System.out.println("I2 = " + word.get(2));
        String deleteElement1 = word.remove(1);
        System.out.println("deleteElement1 > " + deleteElement1);
        System.out.println("word.size() > " + word.size());
        System.out.println("Contains > " + word.contains("One"));
        System.out.println("Contains > " + word.contains("One1"));

        for (int i = 0; i < word.size(); i++) {
            System.out.println(word.get(i));
        }

        for (String item : word) {
            System.out.println(item);
        }
    }

    private static void workWithLinkLists() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.addFirst(0);
        linkedList.addLast(9);
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }
    }

    private static void workWithSets() {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("ABC");
        hashSet.add("Five");
        hashSet.add("One");
        hashSet.add("QWERTY");
        hashSet.add("Two");
        hashSet.add("Three");

        for (String item : hashSet) {
            System.out.println(item);
        }

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("4");
        treeSet.add("6");
        treeSet.add("9");
        treeSet.add("1");

        for (String item : treeSet) {
            System.out.println(item);
        }
    }

    private static void workWithMaps() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("Key1", "Value1Key1");
        hashMap.put("Key3", "Value1Key3");
        hashMap.put("Key1", "Value2Key1");

        for (Map.Entry<String, String> item : hashMap.entrySet()) {
            System.out.println(item.getKey() + " = " + item.getValue());
        }

        KeyMap keyMap1 = new KeyMap(2);
        KeyMap keyMap2 = new KeyMap(5);
        ValueMap vm1 = new ValueMap(23);
        ValueMap vm2 = new ValueMap(53);

        HashMap<KeyMap, ValueMap> hashMapWithO = new HashMap<>();
        hashMapWithO.put(keyMap1, vm1);
        hashMapWithO.put(keyMap2, vm2);

        for (Map.Entry<KeyMap, ValueMap> item : hashMapWithO.entrySet()) {
            item.getKey().doSomething();
            item.getValue().doSomething();
        }

        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put("Two", "Second");
        treeMap.put("One", "First");
        treeMap.put("Five", "Fifth");


        for (Map.Entry<String, String> item : treeMap.entrySet()) {
            System.out.println("Tree > " + item.getKey() + ":" + item.getValue());
        }
    }
}
