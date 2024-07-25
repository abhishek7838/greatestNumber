package positiveOrnegative;

import java.util.ArrayList;
import java.util.Scanner;

public class SomOfFirstNNumber 
{
	void meth1(long number)
	{
		int sum =0;
		ArrayList<Long> al=new ArrayList<Long>();
		for(int i=1;i<=number;i++)
		{
			sum=sum+i;
			al.add((long) sum);
		}
		System.out.println("Sum: "+sum);
         System.out.println(al);;;;
         
	}

	public static void main(String[] args) 
	{
		System.out.println("Enter a number ");
		Scanner sc=new Scanner(System.in);
		long num=sc.nextLong();
		SomOfFirstNNumber sum=new SomOfFirstNNumber();
		sum.meth1(num);
		

	}

}
