package lesson9.lab.problem5;

import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Stream<String> stream
                = Stream.of("Zero", "One", "Two", "Three", "Four",
                        "Five", "Six", "Seven", "Eight", "Nine", "Ten");

        streamSection(stream, 1, 10).forEach(System.out::println);
    }

    static Stream<String> streamSection(Stream<String> stream, int m, int n) {
        return stream
                .limit(n + 1)  
                .skip(m);
    }
}
