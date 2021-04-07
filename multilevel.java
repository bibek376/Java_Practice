class Add {
    void sum(int x, int y)
    {
        System.out.println("Sum is:"+(x+y));
    }
}
class Sub extends Add {
    void sub(int x,int y)
    {
        System.out.println("Sub is:"+(x-y));
    }
}

class Mul extends Sub {
    void mul(int x, int y)
    {
        System.out.println("Mul. is :"+(x*y));
    }
}
class Div extends Mul{
    void div(int x,int y)
    {
        System.out.println("Div is:"+(x/y));
    }
}
public class multilevel {
    public static void main(String args[])
    {
        Div obj1=new Div();
        obj1.sum(4,5);
        obj1.sub(4,5);
        obj1.mul(4,5);
        obj1.div(5,5);
    }
    
}
