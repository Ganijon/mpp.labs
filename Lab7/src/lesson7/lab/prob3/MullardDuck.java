package lesson7.lab.prob3;

class MullardDuck extends Duck implements FlyWithWings, Quack {

    @Override
    void display() {
        System.out.println("Mullard duck in flock...");
    }
}
