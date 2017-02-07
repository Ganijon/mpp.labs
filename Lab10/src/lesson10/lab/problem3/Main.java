package lesson10.lab.problem3;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Double> doubles = Arrays.asList(10.2, 31.4, 16.9, 15.2);
        List<Integer> ints = Arrays.asList(10, 31, 16, 15);
        List<Number> nums = Arrays.asList(10L, 31.4F, 16.9, 1);

        System.out.println(doubles);
        System.out.println(ints);
        System.out.println(nums);

        System.out.println(sum(doubles));
        System.out.println(sum(ints));
        System.out.println(sum(nums));
    }

    public static <T extends Number> Double sum(List<T> list) {
        return list
                .stream()
                .map((i) -> i.doubleValue())
                .reduce(0.0, (a, b) -> a + b);
    }

}
