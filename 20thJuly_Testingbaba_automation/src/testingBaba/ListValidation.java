package testingBaba;

import java.util.ArrayList;

public class ListValidation {

	public static void main(String[] args) {
		ArrayList<Character> list1 = new ArrayList<Character>();
		ArrayList<Character> list2 = new ArrayList<Character>();
		list1.add('a');
		list1.add('a');
		list1.add('c');
		list1.add('d');
		list2.add('a');
		list2.add('b');
		list2.add('d');
		list2.add('c');
		for(int i=0; i<list1.size(); i++)
		{
			char ch = list2.get(0);
		if(list1.get(i)==ch)
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}
		}
		
	}
}
