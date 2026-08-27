package day2708;
import java.util.*;
public class Treemap1 {
	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<>();
        map.put(50, "Fifty");
        map.put(10, "Ten");
        map.put(30, "Thirty");
        map.put(20, "Twenty");
        map.put(40, "Forty");
        
        System.out.println("TreeMap (sorted by key): " + map);
        
        // NavigableMap methods
        System.out.println("First key: " + map.firstKey());
        System.out.println("Last key: " + map.lastKey());
        System.out.println("Higher key than 30: " + map.higherKey(30));
	}
}
