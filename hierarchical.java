class Father{
    int a,b;
    void method1(int x, int y)
    {
        a=x;
        b=y;
    }
}
class Child1 extends Father{
    int  sum()
    {
        return (a+b);
    }
    void display()
    {
        System.out.println("Sum is:"+sum());
    }
}
class Child2 extends Father{
    int sub()
    {
        return (a-b);
    }
    void display()
    {
        System.out.println("Sub is:"+sub());
    }
} 

public class hierarchical {
    public static void main(String args[])
    {
       Child1 obj1=new Child1();
       Child2 obj2=new Child2();
       obj1.sum(5,6);
       obj1.display();
       obj2.sub(5,8);
       obj2.display();

    }
    
}
