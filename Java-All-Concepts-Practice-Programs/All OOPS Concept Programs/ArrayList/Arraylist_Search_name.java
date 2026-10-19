import java.util.*;

class book
{
	int sid;
	String name;
	int price;
	
	book(int sid, String name, int price){
		this.sid=sid;
		this.name=name;
		this.price=price;
	}
}

class  Arraylist_Search_name
{
	public static void main(String[] args) 
	{
		ArrayList li=new ArrayList();
		boolean present=false;
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Book name: ");
		String name=sc.nextLine();
		
		li.add(new book(1,"java", 200));
		li.add(new book(2,"python", 150));
		
		for(Object o:li){
			book b=(book)o;
			
			if(b.name.equals(name)){
		         present=true;
				 break;
			}
		}
		
		if(present){
			System.out.println("Irukku");
		}
		else{
			System.out.println("Illa");
		}
		
	}
}