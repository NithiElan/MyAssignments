package week1.day1;

public class Fibbonacci {

	public static void main(String[] args) {
		int firstNum = 0, secNum = 1, sum = 0;
		System.out.print(firstNum);
		for(int i=1;i<11;i++)
		{
			sum=firstNum+secNum;
			secNum=firstNum;
			firstNum=sum;
			System.out.print(" "+sum);
		}

	}

}
