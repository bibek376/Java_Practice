// Simple program based on a arraylist
import java.util.*;
public class arraylist {
    public static void main(String[] args)
    {
        ArrayList<Integer> L1= new ArrayList<>();
        ArrayList<Integer> L2=new ArrayList<>();
        L2.add(11);
        L2.add(22);
        L2.add(33);
        L2.add(44);
        L1.add(5);
        L1.add(4);
        L1.add(3);
        L1.add(2);
        L1.add(5);
        L1.add(0,55);
        // adding an element in index 0 positions
        L1.addAll(L2);
        // adding arraylist L1 and L2
        // L1.clear();
        // To delete all the elements that are present in L2
        System.out.println(L1.contains(33));
        // To check if element is present or not 
        System.out.println(L1.indexOf(5));
        // System.out.println(L1.lastIndexOf(o:6));
        L1.set(2,455);
        System.out.println("Elements are:");
        for(int i=0; i<L1.size();i++)
        {
            System.out.println(L1.get(i));

            // System.out.print(", ");
            // System.out.println(L1.get(4));
            // get method is used for to get the element in a array
        }
    }

    
}
