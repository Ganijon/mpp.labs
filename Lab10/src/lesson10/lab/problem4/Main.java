package lesson10.lab.problem4;

public class Main {

    public static void main(String[] args) {
        GenericStack<Integer> ints = new GenericStack(3);

        System.out.printf("Size:%s Empty:%s\n", ints.size(), ints.isEmpty());

        ints.push(1);
        ints.push(2);
        ints.push(3);

        System.out.printf("Size:%s Empty:%s\n", ints.size(), ints.isEmpty());

        ints.push(4);

        System.out.printf("Size:%s Empty:%s\n", ints.size(), ints.isEmpty());

        System.out.println(ints.peek());
        System.out.println(ints.peek());
        System.out.println(ints.pop());
        System.out.println(ints.pop());

        System.out.printf("Size:%s Empty:%s\n", ints.size(), ints.isEmpty());

        System.out.println(ints.pop());
        System.out.println(ints.pop());
        System.out.println(ints.pop());
        
        System.out.printf("Size:%s Empty:%s\n", ints.size(), ints.isEmpty());

    }

}
