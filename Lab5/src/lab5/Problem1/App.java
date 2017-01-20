package lab5.Problem1;

public class App {

    public static void main(String[] args) {
        Duck[] flock = new Duck[5];

        try {
            flock[0] = DuckFactory.makeDuck(MullardDuck.class);
            flock[0] = DuckFactory.makeDuck(RedheadDuck.class);
            flock[0] = DuckFactory.makeDuck(MullardDuck.class);
            flock[0] = DuckFactory.makeDuck(MullardDuck.class);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        for (Duck duck : flock) {

        }
    }
}
