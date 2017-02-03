package lesson8.lab.problem5;

import java.util.Arrays;

public class Problem2 {

    public static void main(String[] args) {
        String[] names = {"Alexis", "Tim", "Kyleen", "Christy"};

        // a. Use Arrays.sort() to sort the names by ignore case using Method reference.
        Arrays.sort(names, String::compareToIgnoreCase);

        Arrays.stream(names).forEach(System.out::println);
    }
}
