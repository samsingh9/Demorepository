package testingBaba;

import java.util.Scanner;

public class AddNumInArray {

	public void findmin(int[] num) //[2,5,1,0,7]
	{
		int min = num[0];
		for(int i=1; i<5; i++)
		{
			if(min>num[i])
			{
				min = num[i];
			}
		}
		System.out.println(min);
	}
	
	public static void main(String[] args) {
		ArrayDemo ob = new ArrayDemo();
		ob.arraydemo();
	}
}
