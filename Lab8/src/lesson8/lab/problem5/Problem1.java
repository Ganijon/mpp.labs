package lesson8.lab.problem5;

import java.util.Arrays;
import java.util.List;

public class Problem1 {
    
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Banana", "Orange", "Cherries", "Plums");
        
        // a. Print the given list using forEach with Lambdas
        fruits.stream().forEach(fruit -> System.out.println(fruit));
        
        // b. Print the given list using method reference
        fruits.stream().forEach(System.out::println);
    }
}
