import java.util.function.*;

class  p1_Printanumber
{
	public static void main(String[] args) 
	{
		Consumer<Integer> c=(n)->System.out.println(n);
		
		c.accept(500);
		
	}
}
