package SmallestNum;
import java.util.Scanner;
public class Smallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      
		Scanner scan= new Scanner(System.in);
	       System.out.println("Enter Num A:");
	       int a=scan.nextInt();
	       System.out.println("Enter Num B:");
	       int b=scan.nextInt();
	       System.out.println("Enter Num C:");
	       int c=scan.nextInt();
	       
	       if(a<b && a<c)
	{
	    System.out.println("A is Smallest Number.");
	    
	}   
	else if(b<c && b<a)
	{
	System.out.println("B is Smallest Number.");
	        
	}

	else
	{
	    System.out.println("C is Smallest Number.");
	}
	    }
	
	}

