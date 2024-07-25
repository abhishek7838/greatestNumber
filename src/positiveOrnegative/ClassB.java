package positiveOrnegative;

import java.util.Scanner;

public class ClassB {

	public static void main(String[] args) 
	{
		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num%2==0)
		
			System.out.println(num+" is Even Number");
		
		
		else
		
			System.out.println(num+" is odd Number");
		
		sc.close();
		
	}

}
