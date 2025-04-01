package module3.lesson4.home;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.stream.Collectors;

public class Phonebook {

    private final HashMap<String, ArrayList<Person>> entries = new HashMap<>();

    public void add(String name, String phone, String mail) {
        if (entries.containsKey(name)) {
            ArrayList<Person> persons = entries.get(name);
            persons.add(new Person(phone, mail));
        } else {
            ArrayList<Person> persons = new ArrayList<>();
            persons.add(new Person(phone, mail));
            entries.put(name, persons);
        }
    }

//    public ArrayList<String> getMails(String name) {
//        if (!entries.containsKey(name)) return null;
//        return entries.get(name).stream().map(person -> person.email)
//                .collect(Collectors.toCollection(ArrayList::new));
//    }

    public ArrayList<String> getMails(String name) {
        if (!entries.containsKey(name)) return null;
        ArrayList<Person> persons = entries.get(name);
        ArrayList<String> emails = new ArrayList<>();
        for (Person person : persons) {
            emails.add(person.email);
        }
        return emails;
    }

    public ArrayList<String> getPhones(String name) {
        if (!entries.containsKey(name)) return null;
        ArrayList<Person> persons = entries.get(name);
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < persons.size(); i++) {
            result.add(persons.get(i).phone);
        }
        return result;
    }
}
