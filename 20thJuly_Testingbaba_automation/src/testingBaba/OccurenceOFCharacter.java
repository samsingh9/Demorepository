package testingBaba;

import java.util.Scanner;

public class OccurenceOFCharacter {

	public void countChar(String inp, char ch)
	{
		char[] ch1 = inp.toCharArray();
		int count = 0;
		for(int i=0; i<ch1.length; i++)
		{
			if(ch1[i]==ch)
			{
				count = count + 1;
			}
			
		}
 		System.out.println(ch + " occurs " + count);
	}
	public static void main(String[] args) {
		OccurenceOFCharacter ob = new OccurenceOFCharacter();
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter input");
		String inp = sc.next();
		System.out.println("please enter character to count");
		char ch = sc.next().charAt(0);
		ob.countChar(inp, ch);
	}
}
