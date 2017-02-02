package lesson9.lecture.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Streams {

    /*
    Stream is 
        a sequence of elements supporting sequential 
        or parallel aggregate operations.
     */
    static Consumer<Object> print = System.out::println;

    public static void main(String[] args) {
        String[] words = new String[]{"Hi", "Hello", "Bye", "Ciao"};
        List<String> words2 = Arrays.asList("One", "Two", "Three");

        Stream
                .concat(Arrays.stream(words), words2.stream())
                .forEach(print);

        Stream<String> stream1 = Stream.of();
        stream1.filter(w -> w.startsWith("H"))
                .forEach(System.err::println);

        Stream.of(1F, 2F, 3F, 4F, 5F)
                .sorted((a, b) -> Float.compare(b, a))
                .forEach(System.out::print);

        IntStream stream3 = IntStream.range(1, 6);
        IntStream stream4 = IntStream.rangeClosed(6, 20);
        IntStream.concat(stream3, stream4)
                .limit(10)
                .skip(5)
                .forEach(System.err::println);
        DoubleStream.empty().forEach(System.err::print);

        Stream.generate(Math::random)
                .limit(8)
                .forEach(System.err::println);

        Stream.iterate(0, i -> i + 1)
                .limit(10)
                .map(n -> n * n * n)
                .forEach(System.out::println);

        LongStream s8 = Arrays.stream(new long[]{1L, 2L, 3L});

        HashSet<String> hs = new HashSet<>();
        hs.add("A");
        hs.add("B");
        hs.add("C");
        hs.add("D");
        Stream<String> s9 = hs.parallelStream();
        s9.forEach(System.err::println);

        Supplier<Student> ss = Student::new;
        Student empty = ss.get();

        Function<String, Student> fs = Student::new;
        Student alice = fs.apply("Alice");

        BiFunction<Integer, String, Student> bfs = Student::new;
        Student bob = bfs.apply(7, "Bob");

        TriFunction<Integer, String, Student.Gender, Student> tfs = Student::new;
        Student chris = tfs.apply(8, "chris", Student.Gender.Male);

        //List<Integer, List<String, LocalDate>> complexList;
    }

    @FunctionalInterface
    interface TriFunction<T, U, V, R> {

        R apply(T t, U u, V v);
    }
    
    @FunctionalInterface
    interface QuadFunction<T, U, V, W, R> {

        R apply(T t, U u, V v, W w);
    }
}
