package testingBaba;

import java.util.Scanner;

public class OccurenceOfEachCharacter {

	public void counteachcharacter(String inp) //hellojava
	{

		char[] ch=inp.toCharArray();
		String out = "";                   //helojav
		
		for(int i=0; i<ch.length; i++)
		{
			boolean flag = false;
			for(int j=i+1; j<ch.length; j++)
			{
				if(ch[i]==ch[j])
				{
				  flag = true;
				}
			}
			if(flag==false)
			{
				out = out + ch[i];
			}
		}
		char [] ch1 = out.toCharArray();
		for (int i = 0; i < ch1.length; i++) {
			int count = 0;
			for (int j = 0; j < ch.length; j++) {
				if (ch1[i] == ch[j]) {
					count = count + 1;
				}
			}
			System.out.println(ch1[i] + " " + count);
		}

	}

	public static void main(String[] args) {
		OccurenceOfEachCharacter ob = new OccurenceOfEachCharacter();
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter input");
		String inp = sc.next();
		ob.counteachcharacter(inp);
	}
}
