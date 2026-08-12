abstract class Product{
	int productId;
	String productName;
	double price;
	
	Product(int productId,String productName,double price){
		this.productId = productId;
		this.productName=productName;
		this.price = price;
	}
	//abstract Method
	abstract double calculateDiscount();
	double calculateFinalPrice() {
		//concrete method directly called
		return price - calculateDiscount();
	}
	void displayDetails() {
		System.out.println("ProductId :"+productId);
		System.out.println("ProductName :"+productName);
		System.out.println("Price :"+price);
		System.out.println("Discount :"+calculateDiscount());
		System.out.println("Final Price :"+calculateFinalPrice());
	}
}
//Electronics 10% discount
class Electronics extends Product{
	Electronics(int productId,String productName,double price){
		
		super(productId,productName,price);
	}
	double calculateDiscount() {
		return price*10/100;
	}
}
class Clothing extends Product{
	Clothing(int productId,String productName,double price){
		super(productId,productName,price);
	}
	double calculateDiscount() {
		return price*20/100;
	}
}
//Grocery 5% Discount
class Grocery extends Product{
	Grocery(int productId,String productName,double price){
		super(productId,productName,price);
	}
	double calculateDiscount() {
		return price*5/100;
	}
}

public class Main5 {
	public static void main(String[] args) {
		
		Product p;
		//PrintDetails of Electronics
		System.out.println("-------Electronics-------");
		p = new Electronics(37,"Loq",50000);
		p.displayDetails();
		System.out.println("-------------------------");
		
		//print details of Clothing
		System.out.println("-------Clothing-------");
		p = new Clothing(38,"Blazor",5000);
		p.displayDetails();
		System.out.println("---------------------");
		
		//print details of Grocery
		System.out.println("-------Grocery-------");
		p = new Grocery (39,"Paneer",500);
		p.displayDetails();
		System.out.println("---------------------");
		
		
		
	}

}
