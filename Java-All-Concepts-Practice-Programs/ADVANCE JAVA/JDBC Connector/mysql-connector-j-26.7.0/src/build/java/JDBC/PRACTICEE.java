package JDBC;

class book{
	int price;

	public book(int price) {
		super();
		this.price = price;
	}
	
	
}
public class PRACTICEE{

	public static void main(String[] args){

		book b1=new book(150);
		book b2=new book(100);
		
		Comparable c=(Object o)->{
		book b=(book)o;
		return b1.price-b.price;
	};
	
	    System.out.println(c.compareTo(b2));
	}
}
