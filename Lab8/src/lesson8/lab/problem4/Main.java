package lesson8.lab.problem4;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Main {

    private final static Product[] PRODUCTS = {
        new Product("Armchair", 14.99, 4),
        new Product("Bookcase", 39.99, 1),
        new Product("Cabinet", 19.55, 5),
        new Product("Cabinet", 44.55, 2),
        new Product("Drawer", 49.55, 7),
        new Product("Drawer", 32.55, 3),
        new Product("Workdesk", 19.55, 2),
        new Product("Workdesk", 110.0, 6)};

    public static void main(String[] args) {

        Consumer<Object> print = System.out::print;

        print.accept("\nA. Sort by implementing a comparator for price:");
        
        Stream.of(PRODUCTS)
                .sorted(BY_PRICE)
                .forEach(print);

        print.accept("\nB. Sort by implementing a comparator for title:");
        
        Stream.of(PRODUCTS)
                .sorted(BY_TITLE)
                .forEach(print);

        print.accept("\nC. Sort by decreasing order of price using lambdas:");
        
        Stream.of(PRODUCTS)
                .sorted((p1, p2) -> Double.compare(p2.getPrice(), p1.getPrice()))
                .forEach(print);

        print.accept("\nD. Sort by decreasing order of title using lambdas:");
        
        Stream.of(PRODUCTS)
                .sorted((p1, p2) -> p2.getTitle().compareTo(p1.getTitle()))
                .forEach(print);

        print.accept("\nE. If the title is same use model attribute:");
        
        Stream.of(PRODUCTS)
                .sorted((p1, p2) -> {
                    int result = p1.getTitle().compareTo(p2.getTitle());
                    return (result == 0)
                            ? Integer.compare(p1.getModel(), p2.getModel())
                            : result;
                })
                .forEach(print);
    }

    // a. Comparator implementation by Price
    private final static Comparator<Product> BY_PRICE = new Comparator<Product>() {
        @Override
        public int compare(Product p1, Product p2) {
            return Double.compare(p1.getPrice(), p2.getPrice());
        }
    };

    // b. Comparator implementation by Title
    private final static Comparator<Product> BY_TITLE = new Comparator<Product>() {
        @Override
        public int compare(Product p1, Product p2) {
            return p1.getTitle().compareTo(p2.getTitle());
        }
    };
}
