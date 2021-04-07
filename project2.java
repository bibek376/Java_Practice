// package mypackage;
import java.util.*;
public class project2 { 

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		String mname;
		System.out.println("Enter the movie name - ");
		mname=in.nextLine();
		Movies ob = new Movies();
		ob.price(mname);
	}
}
	
	class Movies
	{
	    private static final String Break = null;
		String ma[]=new String [4];
	    String mc[]=new String[4];
	    Movies()
	    {
	        ma[0]="Avengers";
	        ma[1]="justice league";
	        ma[2]="iron man";
	        ma[3]="hulk";
	        
	        mc[0]="chris evans";
	        mc[1]="Robert pattison";
	        mc[2]="robert downey";
	        mc[3]="Eric bana";
	        
	        
	    }
	    void price(String mname)
	    {
	        int i=0,j=0;
	        while(i<4)
	        {
	            if(mname.equals(ma[i]))
	            {
	                System.out.println(mname+"Price is rupees 100 and maine character is "+mc[i]);
	                break;
	                
	            }else
	            {
	            	System.out.println("not available");
	            }
	        }
	        
	    }
	}