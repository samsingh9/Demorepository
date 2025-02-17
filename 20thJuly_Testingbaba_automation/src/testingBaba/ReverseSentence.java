package testingBaba;

import java.util.Scanner;

public class ReverseSentence {

	public void reverseSpecific(String val, String inp) //my name is java
	{
		String[] str=val.split(" "); //[my, name , is , java]
	String out = "";
		for(int i=0; i<str.length; i++) // java
		{
			
			if(str[i].equals(inp))
			{
			char []ch = str[i].toCharArray();
			for(int j = ch.length-1; j>=0; j--)
			{
				out = out + ch[j];
			}
			out = out + " ";
			}
			else
			{
				out = out + str[i] + " ";
			}
		}
		System.out.println(out);
	}
	public static void main(String[] args) {
		ReverseSentence ob = new ReverseSentence();
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter input");
		String val = sc.nextLine();
		System.out.println("please enter word to match");
		String inp = sc.next();
		ob.reverseSpecific(val, inp);
	}
}
