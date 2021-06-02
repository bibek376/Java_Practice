
class A{
    void sound(){
        System.out.println("Hello");
    }
}
class B extends A{
    void body(){
        System.out.println("Hi");
    }
}

public class single_inheritance {
    public static void main(String args[]){
        B obj=new B();
        obj.sound();
        obj.body();
    }
}
