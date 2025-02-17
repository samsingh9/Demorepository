package testingBaba;

import java.util.Scanner;

public class FindWeekDays {

	public void findDays(String dayName)
	{
		if(dayName.equals("sunday"))
		{
			System.out.println("it is holiday");
		}
		else if(dayName.equals("monday") || dayName.equals("tuesday") || dayName.equals("wednesday")|| dayName.equals("thursday") || dayName.equals("friday") || dayName.equals("saturday"))
		{
			System.out.println("it is working day");
		}
		else
		{
			System.out.println("please enter valid input");
		}
	}
	public static void main(String[] args) {
		FindWeekDays ob = new FindWeekDays();
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the day");
		String dayName = sc.next();
		ob.findDays(dayName);
	}
}
