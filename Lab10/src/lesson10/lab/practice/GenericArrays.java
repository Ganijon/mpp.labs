package lesson10.lab.practice;

import java.util.Collection;
import java.util.List;

class GenericArrays {

    public static void main(String[] args) {
        /* Compiler error: generic array creation
        List<String>[] a = new List<String>[5]; 
        */
        
    }
    public static <T> T[] toArray(Collection<T> coll) {
        //T[] arr = new T[coll.size()]; //compiler error
        T[] arr = (T[])new Object[coll.size()]; //downcasting array type
        int k = 0;
        for (T element : coll) {
            arr[k++] = element;
        }
        return arr;
    }
    
    
    /* Compiler error: generic array creation
    class Another {

        public static List<Integer>[] twoLists() {
            List<Integer> list1 = Arrays.asList(1, 2, 3);
            List<Integer> list2 = Arrays.asList(4, 5, 6);

            return new List<Integer>[]{list1, list2}; 
           
        }
    }
     */
}
