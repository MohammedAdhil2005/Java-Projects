import java.util.*;

class book
{
	int id;
	int price;
	String name;
	
	book(int id,int price,String name){
		this.id=id;
		this.price=price;
		this.name=name;
	}
	public String toString()
	{
		return id+" "+price+" "+name;
	}
}

class  Arraylist_Remove_byName
{
	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		al.add(new book(1,500,"java"));
		al.add(new book(2,300,"sql"));
		al.add(new book(3,450,"python"));
		
		Scanner sc=new Scanner(System.in);
		String remname=sc.nextLine();
		
		Iterator ir=al.iterator();
		
		while(ir.hasNext()){
			book b=(book)ir.next();
			
			if (b.name.equals(remname))
			{
				ir.remove();
			}
		}
		System.out.println(al);
	}
}