package lesson8.lecture.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        Person p1 = new Person("Alice", 20);
        Person p2 = new Person("Bob", 26);
        Person p3 = new Person("Chris", 22);
        Person p4 = new Person("Dave", 21);
        Person p5 = new Person("Elen", 21);

        List<Person> obj = Arrays.asList(p5, p1, p4, p2, p3);

        Collections.sort(obj, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        System.out.println(obj);

        List<Person> obj2 = Arrays.asList(p5, p1, p4, p2, p3);
        Collections.sort(obj2, (o1, o2) -> o1.getName().compareTo(o2.getName()));

        System.out.println(obj);

        StringToIntMapper mapper1 = (String s) -> s.length();

        StringToIntMapper mapper2 = (s) -> s.length();

        StringToIntMapper mapper3 = s -> s.length();

        StringToIntMapper mapper4 = String::length;

        System.out.println(mapper1.map("Aloha"));
        System.out.println(mapper2.map("Hello"));
        System.out.println(mapper3.map("Hola"));
        System.out.println(mapper3.map("Hola"));

        Function<String, Integer> mapper5 = (s) -> s.length();
        
        System.out.println(mapper5.apply("Nihao ma"));

    }

}
