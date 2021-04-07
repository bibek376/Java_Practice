// Simple program based on a LinkedList
import java.util.*;
public class linklist {
    public static void main(String[] args)
    {
        LinkedList<Integer> L1= new LinkedList<>();
        LinkedList<Integer> L2=new LinkedList<>();
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
        L1.addLast(676);
        // Add the element at last positions
        L1.addFirst(234);
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
