package lesson10.lab.problem4;

public class Main {

    public static void main(String[] args) {
        GenericStack<Float> stack = new GenericStack(3);

        System.out.printf("Size:%s Empty:%s\n", stack.size(), stack.isEmpty());

        stack.push(1F);
        stack.push(2F);
        stack.push(3F);

        System.out.printf("Size:%s Empty:%s\n", stack.size(), stack.isEmpty());

        stack.push(4F);

        System.out.printf("Size:%s Empty:%s\n", stack.size(), stack.isEmpty());

        System.out.println(stack.peek());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.printf("Size:%s Empty:%s\n", stack.size(), stack.isEmpty());

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        
        System.out.printf("Size:%s Empty:%s\n", stack.size(), stack.isEmpty());

    }

}
