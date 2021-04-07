abstract class parent{
    abstract void message()
    {
     System.out.println("This is parent class:");   
    }
}
class base1 extends parent{
    message()
    {
        System.out.println("This is first base class");
    }
}
class base2 extends parent{
    message()
    {
        System.out.println("This is the second base classs:");
    }
}
class main{
    public static void main(string args[])
    {
        
    }
}