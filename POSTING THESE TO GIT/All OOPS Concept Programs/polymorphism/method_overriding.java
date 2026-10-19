class parent
{
	public  void m1(){
		System.out.println("First block");
	}
}

class child extends parent
{
	public  void m1(){
		System.out.println("Second block");
	}
}

class  method_overriding
{
	public static void main(String[] args) 
	{
		parent p=new child();
		p.m1();
		
		parent p1=new parent();
		p1.m1();
	}
}
