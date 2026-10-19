import java.util.function.*;

class A_Supplierrr
{
	public static void main(String[] args) 
	{
		Supplier<Integer> s=()->{ 
			return 100;
		};
		
		System.out.println(s.get());
	}
}
