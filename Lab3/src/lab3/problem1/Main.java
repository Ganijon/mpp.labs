package lab3.problem1;

public class Main {

    public static void main(String[] args) {
        PersonWithJob p1 = new PersonWithJob("Joe", 0);
        Person p2 = new Person("Joe");
        PersonWithJob p3 = new PersonWithJob("Joe", 0);
        
        System.out.println("p1.equals(p2)? " + p1.equals(p2)); // false
        System.out.println("p2.equals(p1)? " + p2.equals(p1)); // false
        System.out.println("p1.equals(p3)? " + p1.equals(p3)); // true
    }
}
