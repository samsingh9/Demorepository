package testingBaba;

import java.util.Scanner;

public class ThrowDemo {

	public void validateAge(int age)
	{
		try {
		if(age<18)
		{
			throw new Exception("you are under age");
		}
		else
		{
			System.out.println("your age is valid");
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
			main(null);
		}
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter your age");
		int age = sc.nextInt();
		ThrowDemo ob= new ThrowDemo();
		ob.validateAge(age);
	}
}
