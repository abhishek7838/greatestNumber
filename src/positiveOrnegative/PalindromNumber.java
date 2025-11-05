package positiveOrnegative;

public class PalindromNumber
{
	void checkNumber(int num1)
	{
		int num,rev=0,remender;
		num=num1;
		while(num!=0)
		{
			remender=num%10;
			rev=rev*10+remender;
			num=num/10;
		}
		System.out.println(rev);
		System.out.println(num1);
		if(num1==rev)
		{
			System.out.println(num1+" is palindrom num");
		}
		else
		{
			System.out.println(num1+" is not a palindrom number");
		}
	}

	public static void main(String[] args) {
		PalindromNumber pn=new PalindromNumber();
		pn.checkNumber(121);

	}

}
