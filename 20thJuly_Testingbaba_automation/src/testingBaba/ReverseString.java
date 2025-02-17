package testingBaba;

import java.util.Scanner;

public class ReverseString {

	public void reverseString(String name) //noida
	{
		char[] ch=name.toCharArray(); //n,o,i,d,a
		String out = "";
		for(int i=ch.length-1; i>=0; i--)
		{
			out = out + ch[i];
		}
		System.out.println(out);
	}
	public static void main(String[] args) {
		ReverseString ob = new ReverseString();
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter input");
		String val = sc.next();
		ob.reverseString(val);
		
	}
}
