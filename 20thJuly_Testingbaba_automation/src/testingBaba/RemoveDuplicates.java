package testingBaba;

import java.util.Scanner;

public class RemoveDuplicates {

	public void removceDuplicates(String inp)
	{
		char[] ch=inp.toCharArray();
		String out = "";
		
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
		System.out.println(out);
	}
	public static void main(String[] args) {
		RemoveDuplicates ob = new RemoveDuplicates();
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter input");
		String inp = sc.next();
		ob.removceDuplicates(inp);
		
	}
}
