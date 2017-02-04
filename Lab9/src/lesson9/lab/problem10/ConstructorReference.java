package lesson9.lab.problem10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ConstructorReference {

    static Consumer<Object> printer = System.out::println;

    public static void main(String args[]) {
        Human[] list = {
            new Human("Joe", 35, "Male"),
            new Human("Jane", 45, "Female"),
            new Human("John", 30, "Male")};

        // Query 1 : Print only male candidates
        Arrays.stream(list)
                .filter(h -> h.getGender().equals("Male"))
                .forEach(System.out::println);

        // Query 2 : Create an object by choosing suitable Interface 
        // to the specified constructors(Totally 3 constuctors) 
        // and print the object status
        Function<String, Human> c1 = Human::new;
        BiFunction<String, Integer, Human> c2 = Human::new;
        TriFunction<String, Integer, String, Human> c3 = Human::new;

        Human alice = c1.apply("Alice");
        Human boris = c2.apply("Boris", 21);
        Human chris = c3.apply("Chris", 23, "Male");

        printer.accept(alice);
        printer.accept(boris);
        printer.accept(chris);

        // Query 3 : Convert the Human[] array into ArrayList<Human> 
        // by using suitable Functional Interface either from API or your own 
        
        // Option-A. 
        ArrayList<Human> resultA = new ArrayList<>();
        Arrays.stream(list).forEach(resultA::add);
        printer.accept(resultA);

        // Option-B. 
        Function<Human[], List<Human>> converter = Arrays::asList;
        List<Human> resultB = converter.apply(list);
        printer.accept(resultB);

        // Option-C.
        List<Human> resultC = Arrays
                .stream(list)
                .collect(Collectors.toList());
        printer.accept(resultC);

    }

    @FunctionalInterface
    interface TriFunction<T, U, V, R> {

        R apply(T t, U u, V v);
    }

}
