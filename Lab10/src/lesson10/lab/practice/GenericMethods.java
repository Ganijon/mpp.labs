package lesson10.lab.practice;

public class GenericMethods {

    public static void main(String[] args) {
        genericMethod("Hello");
        genericMethod(3.14f);
        genericMethod(new Exception());
    }

    public static <T> void genericMethod(T t) {
        System.out.println(t);
    }
}
