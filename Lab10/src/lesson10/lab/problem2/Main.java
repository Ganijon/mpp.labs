package lesson10.lab.problem2;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Orange", "Apple", "Grapes");
        List<Double> doubles = Arrays.asList(10.2, 31.4, 16.9, 15.2);
        List<LocalDate> dates = Arrays.asList(
                LocalDate.of(2015, 1, 1),
                LocalDate.of(2010, 1, 1),
                LocalDate.of(2014, 1, 1));

        System.out.println(strings);
        System.out.println(doubles);
        System.out.println(dates);

        System.out.println(secondSmallest(strings));
        System.out.println(secondSmallest(doubles));
        System.out.println(secondSmallest(dates));
    }

    public static <T extends Comparable<? super T>> T secondSmallest(List<T> list) {
        List<T> tmp = list
                .stream()
                .sorted()
                .collect(Collectors.toList());

        return tmp.get(1); // get 2nd min
    }

}
