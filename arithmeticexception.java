public class arithmeticexception {
    public static void main(String args[]){
       try{
        int p=20,q=0;
        int r=p/q;
        System.out.println("Result is: "+r);
       }
       catch(ArithmeticException e){
           System.out.println("Number can not divided by 0:");
       }
       finally{
           System.out.println("Done...");
       }
    }
    
}
