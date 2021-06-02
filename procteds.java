// private access modifier

class A{
    private int a=30;
    protected void msg(){
        System.out.println("hello i am priocted and i am accessable in a child class::");
    }
}

class procteds{
    public static void main(String args[]){
        A obj=new A();
        // System.out.println(obj.a);
        obj.msg();
    }
}