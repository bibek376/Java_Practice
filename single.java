class parent {
    void method1()
    {
        System.out.println("Hello son:");
    }

}

class child extends parent {
    void method2()
    {
        System.out.println("Hello i am child:");
    }

}




public class single {
    public static void main(String args[])
    {
       child obj1=new child();
       obj1.method1();
       obj1.method2();
    }
    
}
