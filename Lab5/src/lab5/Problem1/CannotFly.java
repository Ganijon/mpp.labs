package lab5.Problem1;

class CannotFly implements FlyBehaviour {

    @Override
    public void fly() {
        System.out.println("Can't fly - no wings");
    }
    
}
