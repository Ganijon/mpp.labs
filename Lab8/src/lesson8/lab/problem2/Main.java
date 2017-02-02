package lesson8.lab.problem2;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Main {
    
    static Consumer<String> printer = System.out::println;
    
    public static void main(String[] arg) {
        printer.accept("Random numbers by:");

        Supplier<Double> random1 = Math::random;
        printer.accept(" i. Method Reference: " + random1.get());
        
        Supplier<Double> random2 = ()-> Math.random();
        printer.accept(" ii. Lambda Expression: " + random2.get());
        
        Supplier<Double> random3 = new Main().new RandomSupplier();
        printer.accept(" iii. Inner class: " + random3.get());
    }
    
    //inner class implementation of Supplier<T>
    private class RandomSupplier implements Supplier<Double> {
        @Override
        public Double get() {
            return Math.random();
        }
    }
}
