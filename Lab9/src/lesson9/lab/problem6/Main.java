package lesson9.lab.problem6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BinaryOperator;

public class Main {

    public static void main(String[] args) {
        Set<String> set1 = new LinkedHashSet<>(Arrays.asList("A", "B"));
        Set<String> set2 = new LinkedHashSet<>(Arrays.asList("D"));
        Set<String> set3 = new LinkedHashSet<>(Arrays.asList("1", "3", "5"));

        List<Set<String>> sets = new ArrayList<>(Arrays.asList(set1, set2, set3));

        Set<String> unitedSet = union(sets);

        System.out.println(unitedSet);
    }

    public static Set<String> union(List<Set<String>> sets) {

        BinaryOperator<Set<String>> reduceAccumulator = (s1, s2) -> {
            s1.addAll(s2);
            return s1;
        };
        
        Set<String> reduceId = new LinkedHashSet<>();

        return sets
                .stream()
                .reduce(reduceId, reduceAccumulator);

    }
}
