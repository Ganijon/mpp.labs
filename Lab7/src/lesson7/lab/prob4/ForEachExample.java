package lesson7.lab.prob4;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachExample {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon",
                "Away", "On Vacation", "Everywhere you want to be");

        //print each element of the list in upper case format
        //
        System.out.println("#1. Static class");
        list.forEach(new UpperCaseConsumer());

        System.out.println("#2. Anonymous class");
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String t) {
                System.out.println(t.toUpperCase());
            }
        });

        System.out.println("#3. Lambda expression");
        list.forEach((String t) -> {
            System.out.println(t.toUpperCase());
        });

        System.out.println("#4. Shorter Lambda expression");
        list.forEach(t -> System.out.println(t.toUpperCase()));
    }

    //implement a Consumer
    static class UpperCaseConsumer implements Consumer<String> {

        @Override
        public void accept(String t) {
            System.out.println(t.toUpperCase());
        }
    }
}
