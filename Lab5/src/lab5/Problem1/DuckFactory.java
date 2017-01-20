package lab5.Problem1;

public class DuckFactory {

    private DuckFactory() {
    }

    public static Duck makeDuck(Class<? extends Duck> classDuck) throws Exception {

        Duck newInstance = classDuck.newInstance();

        return newInstance;
    }
}
