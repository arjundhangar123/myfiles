package Collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample2 {

	public static void main(String[] args) {
		//creating hashmap and adding elements
		HashMap<Integer,String>map=new HashMap<Integer,String>();

		map.put(101, "mango");
		map.put(102, "Apple");
		map.put(103, "Banana");
		map.put(101, "Grapes");//trying duplicate key
		
		System.out.println("iterating hashmap..");
		
		map.remove(101);
		System.out.println("updated list of elements:"+map);
		
		map.replace(103, "Arjun");

		for(Map.Entry m:map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
			
			
		}
	}

}
