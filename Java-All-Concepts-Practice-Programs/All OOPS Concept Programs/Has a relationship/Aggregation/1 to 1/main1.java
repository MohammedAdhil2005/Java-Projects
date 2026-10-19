class car
{
	String name;
	int price;
	String color;
	
	engine e;
	
	car(String name, int price ,String color){
		this.name=name;
		this.price=price;
		this.color=color;
	}
	
	public void getengine(engine e){
		this.e=e;
	}
	
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

class main1
{
	public static void main(String[] args) 
	{
		car c=new car("BMW",5000,"Red");
		
		c.getengine(new engine("gas",200));
		
		System.out.println(c.name +" "+c.color+" "+c.price+"\n");
		System.out.println(c.e.type+" "+c.e.speed);
	}
}
