package positiveOrnegative;

public class ArmStrongNum 
{
	
	void armStrong(int num)
	{
		int length=0,sum=0,temp,digit;
		temp=num;
		while(temp!=0)
		{
			length++;
			temp=temp/10;
		}
		temp=num;
		while(temp!=0)
		{
			digit=temp%10;
			sum+=power(digit,length);
			temp=temp/10;
		}
		System.out.println("Sum "+sum);
		if(num==sum)
			System.out.println(num+" is an ArmStrong Number");
		else
			System.out.println(num+" is not an ArmStrong Number");
			
		
	}
	static int power(int digit,int len)
	{
		int mul;
		mul=digit;
		
		for(int i=1;i<len;i++)
		{
			mul*=digit;
		}
		return mul;
	}

	public static void main(String[] args)
	{
		ArmStrongNum as=new ArmStrongNum ();
		as.armStrong(371);
		
	}

}
