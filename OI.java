
// class and inner class
class A{
    int x=10;
    class B{
        int num(){
            return x;
        }
    }
}
public class OI{
    public static void main(String args[]){
        A obj=new A();
        A.B obj1=obj.new B();
        System.out.println(obj1.num());
    }
}