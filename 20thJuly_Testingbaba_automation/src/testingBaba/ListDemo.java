package testingBaba;

import java.util.ArrayList;

public class ListDemo {

	public static void main(String[] args)
	{
		//ArrayList<Object> list = new ArrayList<>();
		ArrayList<Integer> list = new ArrayList<>();
		list.add(12);
		//list.add("java");
		//list.add('a');
		list.add(23);
		//System.out.println(list);
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(34);
		list1.addAll(list);
		
	   
		for(int i=0; i<=1; i++)
		{
			//System.out.println(list.get(i));
		}
		
		for(int dd:list1)
		{
			System.out.println(dd);
		}
	
		
	System.out.println(list1.containsAll(list));
	
	
	}
}
