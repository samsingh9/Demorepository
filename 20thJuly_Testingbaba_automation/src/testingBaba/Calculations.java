package testingBaba;

import java.util.Scanner;

public class Calculations {

	public void subTwoNum()
	{
		int num1 = 45;
		int num2 = 34;
		int out = num1-num2;
		System.out.println(out);
	}
	public void addTwoNum(int num1, int num2)
	{
   int out =num1+num2;
		System.out.println(out);
	}

	public static void main(String[] args)
	{
		Calculations ob = new Calculations();
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter two values");
		int num1=sc.nextInt();
	    int num2 =sc.nextInt();
        ob.addTwoNum(num1,num2);
	}

}
