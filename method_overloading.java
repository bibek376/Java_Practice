
class A{
    static int add(int a,int b){
        return a+b;
    }
    
    static int add(int a,int b,int c){
        return a+b+c;
    }
}

public class method_overloading {
    public static void main(String args[]){
        System.out.println(A.add(1,2));
        System.out.println(A.add(1,2,3));
    }
    
}
