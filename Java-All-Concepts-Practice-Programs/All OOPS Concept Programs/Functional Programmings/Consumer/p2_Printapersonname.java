import java.util.function.*;

class  p2_Printapersonname
{
	public static void main(String[] args) 
	{
		Consumer<String> c=(a)->System.out.println("Person name is --> "+a);
		
		c.accept("Adhil");
	}
}
