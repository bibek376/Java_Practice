// Java HashSet example ignoring duplicate elements

import java.util.*;
public class hashset {
    public static void main(String[] args){
        HashSet<String> obj1 =new HashSet<String>();
        obj1.add("Bibek");
        obj1.add("carlos");
        obj1.add("Bibek");
        obj1.add("Hello World!");
        System.out.println(obj1);
    }
    
}
