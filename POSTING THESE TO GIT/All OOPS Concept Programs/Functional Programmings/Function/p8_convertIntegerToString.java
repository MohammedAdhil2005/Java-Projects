import java.util.function.*;

class  p8_convertIntegerToString
{
	public static void main(String[] args) 
	{
		Function<Integer, Character> f = (a) -> (char)a.intValue();
		
		System.out.println("NUMBER TO CHAR IS ---> "+f.apply(67));
	}
}
