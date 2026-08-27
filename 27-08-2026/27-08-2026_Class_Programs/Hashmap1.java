package day2708;
import java.util.*;
public class Hashmap1 {
	public static void main(String[] args) {
		HashMap<String,Integer> map = new HashMap<>();
		//put
		map.put("Porshe", 100);
		map.put("BMW",250);
		map.put("Audi",110);
		
		//get
		
		System.out.println("Porshe : "+map.get("BMW"));
		
		//keySet()
		System.out.println("Keys : "+map.keySet());
		
		
		//values()
		System.out.println("Values : "+map.values());
		
		//entrySet()
		
		System.out.println("Entries : ");
		
		
		for(Map.Entry<String,Integer> entry : map.entrySet()) {
			System.out.println("Key : "+entry.getKey()+",value : "+entry.getValue());
		}
		
		//containskey
		
		System.out.println("contains 'Audi'?"+map.containsKey("Audi"));
		
		
		// remove
        map.remove("Orange");
        System.out.println("After removal: " + map);
		
		
		
		
		
		
		}
	
	
	
		
	
}
