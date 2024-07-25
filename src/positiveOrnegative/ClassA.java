package positiveOrnegative;

import java.util.ArrayList;
import java.util.Scanner;

public class ClassA
{
	void meth1(int num)
	{
		
		if(num>0)
		{
		    System.out.println("positive");
		}
		else if(num<0)
		{
			System.out.println("negative");
		}
		else
			System.out.println("zero");
		
		
	}

	public static void main(String[] args)
	{
		ClassA ab=new ClassA();
		System.out.println("first Question of PrepIntsa:\n");
		System.out.println("how many do you want to check  Number");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=0;i<a;i++)
		{
			al.add(sc.nextInt());
		}
		for(int i1=0;i1<al.size();i1++)
		{
			ab.meth1(al.get(i1));
		}
		
		sc.close();
		

	}

}
