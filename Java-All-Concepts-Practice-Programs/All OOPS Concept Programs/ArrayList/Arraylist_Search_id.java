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

class  Arraylist_Search_id
{
	public static void main(String[] args) 
	{
		ArrayList li=new ArrayList();
		boolean present=false;
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the ID: ");
		int id=sc.nextInt();
		
		li.add(new book(1,"java", 200));
		li.add(new book(2,"Python", 150));
		
		for(Object o:li){
			book b=(book)o;
			
			if(b.sid==id){
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