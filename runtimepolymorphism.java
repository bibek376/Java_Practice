
class Bike{
    void run(){
        System.out.println("Running");
    }
}

class Splender extends Bike{
    void run(){
        System.out.println("Running Bike at speed of 60 k.m/hr");
    }
}

public class runtimepolymorphism {
    public static void main(String args[]){
        Bike b=new Splender(); //upcasting
        b.run();
    }
    
}
