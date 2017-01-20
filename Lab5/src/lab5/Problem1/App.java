package lab5.Problem1;

public class App {

    public static void main(String[] args) {
        
        Duck[] flock = new Duck[4];

        try {
            flock[0] = DuckFactory.makeDuck(MullardDuck.class);
            flock[1] = DuckFactory.makeDuck(RedheadDuck.class);
            flock[2] = DuckFactory.makeDuck(RubberDuck.class);
            flock[3] = DuckFactory.makeDuck(DecoyDuck.class);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        for (Duck duck : flock) {
               duck.display();
        }
    }
}
