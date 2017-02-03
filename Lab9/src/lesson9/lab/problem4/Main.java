package lesson9.lab.problem4;

import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        printSquares(4);
        printSquares(7);
        printSquares(10);
    }

    public static void printSquares(int num) {

        IntUnaryOperator f = (n) -> n + 1;

        IntStream
                .iterate(1, f)
                .limit(num)
                .map(n -> n * n)
                .forEach((n) -> System.out.printf("%s, ", n));
    }
}
