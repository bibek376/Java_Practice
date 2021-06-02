// private access modifier

class A{
    private int a=30;
    private void msg(){
        System.out.println("hello i am private:");
    }
}

class privates{
    public static void main(String args[]){
        A obj=new A();
        System.out.println(obj.a);
        obj.msg();
    }
}