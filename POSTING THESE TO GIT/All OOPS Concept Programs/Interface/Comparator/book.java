import java.util.Arrays;
import java.util.Comparator;

class book 
{
	int price;
	String name;
	
	book(int price,String name){
		this.name=name;
		this.price=price;
	}
	
	public static void main(String[] args) 
	{
		book[] b=new book[2];
		
		b[0]=new book(200,"java");
		b[1]=new book(150,"python");
		
		pricecomparator pc=new pricecomparator();
		
		Arrays.sort(b,pc); //internally called compare method 
		
		for(book bb:b){
			System.out.println(bb.price+" "+bb.name);
		}
	}
}

class pricecomparator implements Comparator 
{
	public int compare(Object o1,Object o2){
		book b1=(book)o1;
		book b2=(book)o2;
		
		return b1.price-b2.price;
	}
}
