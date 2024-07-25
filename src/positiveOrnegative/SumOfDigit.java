package positiveOrnegative;

public class SumOfDigit
{

	public static void main(String[] args)
	{
		long number=222645;
		long tamp;
		tamp=number;
		long sum=0;
		while(tamp!=0)
		{
			tamp=number%10;
			sum+=tamp;
			number=number/10;
		}
		System.out.println(sum);
		
	}

}
