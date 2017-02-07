package lesson10.lab.practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class GenericWildCards {

    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(2);
        ints.add(3);

        display(ints);

        System.out.println(findMax1(ints));
        System.out.println(findMax2(ints));

        List<LocalDate> dates = new ArrayList<>();
        dates.add(LocalDate.of(2000, 1, 1));
        dates.add(LocalDate.of(2005, 1, 1));
        dates.add(LocalDate.of(2010, 1, 1));

        //System.out.println(findMax1(dates)); // compiler error: 
        System.out.println(findMax2(dates)); // OK

        count(ints, 5);
        System.out.println(ints);

        List<Number> ints2 = new ArrayList<>();
        count(ints2, 5);
        System.out.println(ints2);

        List<Object> ints3 = new ArrayList<>();
        count(ints3, 5);
        ints3.add("five");
        System.out.println(ints3);

    }

    static void count(Collection<? super Integer> ints, int n) {
        for (int i = 1; i < n; ++i) {
            ints.add(i);
        }
    }

    static void display(Collection<?> c) {
        for (Object o : c) {
            System.out.printf("%s ", o);
        }
        System.out.println();
    }

    static void copyFirstToEnd(List<?> list) {
        //c.add(4); //compiler error: ? - unknown type variables
        capture(list); // OK: use capture method to resolve unknown type variabless

    }
    // Capture methods help to resolve ? - unknown type variables
    static <T> void capture(List<T> c) {
        T i = c.get(0);
        c.add((T) i);
    }

    // this method has a limitation for LocalDate
    // Because LocalDate's immediate parent ChronoLocalDate isn't Comparable
    static <T extends Comparable<T>> T findMax1(List<T> list) {
        T max = list.get(0);

        for (T i : list) {
            if (i.compareTo(max) > 0) {
                max = i;
            }
        }

        return max;
    }

    // this method can work with LocalDate 
    // LocalDate implements ChronoLocalDate, which extends Comparable<ChronoLocalDate>
    static <T extends Comparable<? super T>> T findMax2(List<T> list) {
        T max = list.get(0);

        for (T i : list) {
            if (i.compareTo(max) > 0) {
                max = i;
            }
        }

        return max;
    }

    static <T> void copy(List<? super T> destination, List<? extends T> source) {
        for (int i = 0; i < source.size(); i++) {
            destination.set(i, source.get(i));
        }
    }
}
