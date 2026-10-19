interface test
{
	int a=10;
	static int b=20;
	
	public static void m1(){
		System.out.println("This is static method in interface!!!");
	}
	
	
	private void secure(){
		String name ="Mohammed adhil";
		System.out.println(name);
		
	}
	
	default void store(){
		secure();
	}
	
	
}

class  interfacee implements test
{
	public static void main(String[] args) 
	{
		interfacee i =new interfacee();
		
		System.out.println(i.a);
		System.out.println(i.b);
		
		test.m1(); //using only interface name 
		i.store();
	}
}
