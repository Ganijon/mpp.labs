package lesson7.lab.prob3;

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
            System.out.printf("\n[%s]\n", duck.getClass().getSimpleName());
            duck.display();
            duck.fly();
            duck.quack();
            duck.swim();
        }
    }
}
