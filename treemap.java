// Simple program to for TreeMap 

// Tree map always maintain order.
import java.util.*;

public class treemap {
    public static void main(String[] args){
        TreeMap<Integer,String> obj1= new TreeMap<Integer,String>();
        obj1.put(2,"carlos");
        obj1.put(1,"bibek");
        obj1.put(4,"carlos");
        System.out.println(obj1);
    }
    
}
