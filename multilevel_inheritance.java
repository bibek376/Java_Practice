// Multilevel inheritance in java
class A{
    void apple(){
        System.out.println("Hello i am apple:");
    }
}

class B extends A{
    void ball(){
        System.out.println("Hello i am ball:");
    }
}

class C extends B{
    void cat(){
        System.out.println("Hello i am cat:");
    }
}

public class multilevel_inheritance {
    public static void main(String args[]){
        C obj=new C();
        obj.ball();
        obj.apple();
        obj.cat();
    }
    
}
