package testingBaba;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		Set<Integer> hset = new TreeSet<Integer>();
		
		hset.add(12);
		hset.add(34);
		hset.add(23);
		hset.add(87);
		ArrayList<Integer> list = new ArrayList<Integer>(hset);
		System.out.println(list.get(0));
	
		Iterator<Integer> it=hset.iterator();
		while(it.hasNext())
		{
			//System.out.println(it.next());
		}
		
		
		
		
		/*for(int dd: hset)
		{
			System.out.println(dd);
		}*/
		
	//	System.out.println(hset);
	}
}
