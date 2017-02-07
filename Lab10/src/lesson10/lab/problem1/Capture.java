package lesson10.lab.problem1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Capture {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "MPP", "SE");

        System.out.println(list);
        
        reverse(list); 
        
        System.out.println(list);
    }

    // uses helper method to capture wildcard
    public static void reverse(List<?> list) {
        reverseHelp(list);
    }

    private static <T> void reverseHelp(List<T> list) {
        List<T> tmp = new ArrayList<>(list);
        
        for (int i = 0, j = list.size() -1; i < list.size(); i++, j--) {
            list.set(i, tmp.get(j));
        }
    }
}
