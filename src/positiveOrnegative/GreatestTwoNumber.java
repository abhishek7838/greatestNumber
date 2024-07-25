package positiveOrnegative;

public class GreatestTwoNumber {

	public static void main(String[] args) 
	{
		int a=200, b=200,c=200;
		if(a>=b&&a>=c)
		{
			if(a==b)
		   System.out.println("a and b both equals");
			
			else if(a==b&&a==c)
				System.out.println("all are equals");
			else
			
				System.out.println("a is big");
			
		}
		else if(b>a&&b>c)
		{
			System.out.println("b is big");
		}
		else if(c>a&&c>b)
		{
			System.out.println("c is big");
		}
		
		
	}

}
