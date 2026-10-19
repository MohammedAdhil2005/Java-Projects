class car
{
	String name;
	int price;
	String color;
	
	car(String name, int price ,String color){
		this.name=name;
		this.price=price;
		this.color=color;
	}
	
	tyre[] t={new tyre("MRF",100),new tyre("appolo",100),new tyre("ceat",100),new tyre("jk",100)};
}

class tyre
{
	String brand;
	int price;
	
	tyre(String brand, int price){
		this.brand=brand;
		this.price=price;
	}
}


class driver 
{
	public static void main(String[] args) 
	{
		car c=new car("BMW",5000,"Red");
		
		System.out.println(c.name +" "+c.color+" "+c.price+"\n");
		
		for(int i=0;i<c.t.length;i++){
			System.out.println(c.t[i].brand+" "+c.t[i].price);
		}

	}
}
