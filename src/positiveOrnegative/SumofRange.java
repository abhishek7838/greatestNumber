package positiveOrnegative;

import java.util.Scanner;

public class SumofRange 
{
	void sumOfRange(long s,long e)
	{
		long sum=0;
		System.out.println("Sum of "+s+" to "+e);
		for(long i=s;i<=e;i++)
		{
			sum+=i;
		}
		System.out.println("Sum: "+sum);
	}

	public static void main(String[] args)
	{
		SumofRange range=new SumofRange();
		System.out.println("Enter number range ");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number: ");
		long start=sc.nextLong();
		System.out.println("Enter second Number ");
		long second=sc.nextLong();
		range.sumOfRange(start,second);
		sc.close();
		
		

	}

}
