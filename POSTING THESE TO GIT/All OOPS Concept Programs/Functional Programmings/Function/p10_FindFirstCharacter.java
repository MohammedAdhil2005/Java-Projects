import java.util.function.*;

class  p10_FindFirstCharacter
{
	public static void main(String[] args) 
	{
		Function<String, Character> f = (a) -> a.charAt(0);
		
		System.out.println("FIRST CHARACTER IS ---> "+f.apply("Adhil"));
	}
}
