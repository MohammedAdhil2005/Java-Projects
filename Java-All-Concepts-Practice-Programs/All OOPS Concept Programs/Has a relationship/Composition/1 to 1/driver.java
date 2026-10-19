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
	
	engine e=new engine("Diesel",100);
}

class engine
{
	String type;
	int speed;
	
	engine(String type, int speed){
		this.type=type;
		this.speed=speed;
	}
}

class driver
{
	public static void main(String[] args) 
	{
		car c=new car("BMW",5000,"Red");
		
		System.out.println(c);
		System.out.println(c.name +" "+c.color+" "+c.price+" "+c.e.type+" "+c.e.speed);
	}
}
