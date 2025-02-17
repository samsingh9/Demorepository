package testingBaba;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args)
	{
	 Map<Integer, Character> map = new HashMap<Integer, Character>();
	 map.put(1, 'a');
	 map.put(2, 'a');
	 map.put(3, 'a');
	 map.put(4, 'a');
	
	 Set<Entry<Integer, Character>> set=map.entrySet();
	 for(Entry<Integer, Character> dd:set)
	 {
		 System.out.println(dd.getKey()+" "+dd.getValue());
	 }
	 
			 
	}
}
