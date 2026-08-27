package day2708;
import java.util.*;


public class Hashset1 {
	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<>();
		set.add("dinesh");
		set.add("raja");
		set.add("dinesh");
		set.add(null);

		System.out.println(set);
		System.out.println(set.contains("dinesh"));
		System.out.println(set.size());
		set.remove("dinesh");
		System.out.println(set);
	}
}
