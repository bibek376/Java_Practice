
class Animal{
    void eat(){
        System.out.println("All animals eat food:");
    }
}
class Cat extends Animal{
    void eat(){
        System.out.println("Cat is domestic a animal:");
    }
}
class Dog extends Cat{
    void eat(){
        System.out.println("Dog are friendly in nature:");
    }
}

public class multilevel_inheritance_with_runtime_polymorphism {
    public static void main(String args[]){
        Animal a1,a2,a3;
        a1=new Animal();
        a2=new Cat();
        a3=new Dog();

        a1.eat();
        a2.eat();
        a3.eat();


    }
    
}
