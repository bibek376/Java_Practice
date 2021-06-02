
class A{
    int fact=1;
    int factorial(int x){
        while (x>1){
            fact=fact*x;
            x=x-1;
        }
        return fact;
    }
}
class B extends A{
    int sum(int a, int b){
        return a+b;
    }

}
class C extends A{
    int mul(int a, int b){
        return a*b;
    }
}

public class hierarchical_inheritance {
    public static void main(String args[]){
        C obj=new C();
        System.out.println("Factorial is: "+obj.factorial(5));
        System.out.println("multiplication is: "+obj.mul(3,4));
        // System.out.println("Addition is: "+obj.sum(1,2));
        // not accessable
    }
}
