package lesson7.lab.prob3;

class DecoyDuck extends Duck {
    DecoyDuck(){
        setFlyBehaviour(new CannotFly());
        setQuackBehaviour(new MuteQuack());
    }

    @Override
    void display() {
        System.out.println("Decoy duck in flock...");
    }
}
