import java.util.function.*;

class A_Consumerrr
{
	public static void main(String[] args) 
	{
		Consumer<Integer> c1=(n)->System.out.println(n+n);
		
		c1.accept(4);
		
	}
}
