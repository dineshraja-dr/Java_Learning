package day1408;

public class Garbage {
	public static void main(String[] args) {
		System.out.println("Start");
		String str = new String("Dinesh");
		str = null;
		System.gc();
		System.exit(1);
		System.out.println("End");
	}
}
