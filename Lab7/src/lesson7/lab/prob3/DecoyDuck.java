package lesson7.lab.prob3;

class DecoyDuck extends Duck implements CannotFly, MuteQuack {

    @Override
    void display() {
        System.out.println("Decoy duck in flock...");
    }
}
