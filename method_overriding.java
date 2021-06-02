
class A{
    void run(){
        System.out.println("I am running:");
    }
}

class B extends A{
    void run(){
        System.out.println("I am class B:");
    }
}
public class method_overriding {
    public static void main(String args[]){
        B obj=new B();
        obj.run();
    }
    
}
