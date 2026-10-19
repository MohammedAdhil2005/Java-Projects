import java.util.function.*;

class  p4_ReturnrandomNumber
{
	public static void main(String[] args) 
	{
		Supplier<Integer> s=()->
		{
			return (int)(Math.random() * 100);
		};
		System.out.println(s.get());
	}
}
