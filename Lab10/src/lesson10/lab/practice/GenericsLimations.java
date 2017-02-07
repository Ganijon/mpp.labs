package lesson10.lab.practice;

import java.util.ArrayList;
import java.util.List;

public class GenericsLimations {

    public static void main(String[] args) {

        //List<String>[] a = new List<String>[5]; // compiler error:
        // generic array creation
        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(2);

        List<? extends Number> nums = ints;
        Number n = nums.get(0); // OK
        nums.add(null); //OK: nulls is allowed
        //nums.add(3.14); 
        // compiler error: boolean add(? extends Number e);
        // ? is unknown type, add method allows specific type, not any unknown type

        List<? super Number> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        Object ob = list.get(0);
        Number num = (Number) list.get(1);
        
        
        List<Number> list1 = new ArrayList<>();
        List<Double> list2 = new ArrayList<>();
        list1.addAll(list2); //OK: boolean addAll(Collection<? extends E> c)

        System.out.println(ints.toString()); //output: [1, 2]

    }

}
