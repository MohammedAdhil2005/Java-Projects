package JDBC;

interface one{
	void m1();
}

public class PRACTICE1 {
	public static void main(String[] args) {

		book b1=new book(100);
		book b2=new book(50);
		
		Comparable c=(Object o)->{
			book b=(book)o;
			return b1.price-b2.price;
		};
		
		System.out.println(c.compareTo(b2));
	}

}
