package lesson9.lab.problem4;

import java.util.function.IntConsumer;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        printSquares(4);
        printSquares(7);
        printSquares(10);
    }

    public static void printSquares(int num) {
        IntConsumer printOut = (n) -> System.out.printf("%s, ", n);
        IntUnaryOperator squareUp = (n) -> n * n;

        IntUnaryOperator increment = (n) -> n + 1;
        
        IntStream
                .iterate(1, increment)
                .limit(num)
                .map(squareUp)
                .forEach(printOut);
    }
}
