package pgm4;

import java.util.Scanner;

public class Number {
	

	public static void main(String[] args) {
		
		System.out.println("Enter A Number");
		
		Scanner num = new Scanner(System.in);
		int i = num.nextInt();
		
		if(i>0)
		{
			System.out.println("It is a Positive Number");
			
		}
		else if(i<0)
		{
			System.out.println("It is a Negative Number");
		}
		
		
		// TODO Auto-generated method stub

	}

}
