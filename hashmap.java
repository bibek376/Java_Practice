// Simple program based on a hashmap

import java.util.*;
public class hashmap {
    public static void main(String[] args){
        int a=10;
        int b=4;
        int c=2;

        // HashMap<String,Integer> obj1= new HashMap<String,Integer>();
        // // first=key and second=value
        // obj1.put("a",10);
        // obj1.put("b",120);
        // obj1.put("c",0);

        // System.out.println(obj1);
        // System.out.println(obj1.get("c"));
        HashMap<String,String> obj1=new HashMap<String,String>();
        obj1.put("Bibek","376fg");
        obj1.put("carlos","hello_world");
        System.out.println(obj1);
        // remove Bibek
        obj1.remove("Bibek");
        System.out.println(obj1);
        // let's check either value is contain or not.
        System.out.println(obj1.containsValue("hello_world"));

        System.out.println(obj1.size());

        System.out.println(obj1.replace("carlos","hello_world","Hey"));
        System.out.println(obj1);

        System.out.println(obj1.keySet());




    }
    
}
