package week1.day1;

public class IsPrime {
	public static void main(String[] args) {
		int num=47;
		boolean flag=false;
		for(int i=2;i<num-1;i++)
		{
			if(num%i==0)
			{
				flag=true;
				break;
			}
		}
		if(!flag)
		{
			System.out.print("It is a prime number");
		}
		else
		{
			System.out.print("It is  not a prime number");
		}
	}

}
