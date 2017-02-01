package lesson8.lab.prob1;

import java.util.function.Predicate;

public class MyClass {

    public static void main(String[] args) {
        
        MyClass o1 = new MyClass(10, 15);
        MyClass o2 = new MyClass(20, 25);
        MyClass o3 = new MyClass(20, 25);

        System.out.println(o1.myMethod(o2)); // false
        System.out.println(o2.myMethod(o3)); // true
        System.out.println(o3.myMethod(o1)); // false
    }

    private int x, y;

    public MyClass(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean myMethod(MyClass cl) {

        Predicate<MyClass> predicate = this::equals;

        return predicate.test(cl);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (o.getClass() != this.getClass()) {
            return false;
        }

        MyClass cl = (MyClass) o;
        return (this.x == cl.x) && (this.y == cl.y);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.x;
        return hash;
    }
}
