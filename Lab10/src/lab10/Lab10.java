package lab10;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Lab10 <E> {

    public static void main(String[] args) {
        
        Set[] sets = new TreeSet[10];
        
        TreeSet[] treesets = new TreeSet[10];
        
        sets = treesets;
        
        ArrayList<Set> setList = new ArrayList<>();
        
        
        //String s = method("Hi");
        
    }
    
    public static <T> void method() {
       
        T[] a = (T[])new Object[10];
       
    }
    
    static class Super {
        Object doSomething(){
            return new Object();
        }
        
        void doSomething(String s) {
            s = "Contravariance!";
        }
    }
    
    static class Sub extends Super {
        @Override
        String doSomething(){
            return "Covariance!";
        }
        
        void doSomething(Object o){
            o = "Contravariance!";
        }
    }
    
}
