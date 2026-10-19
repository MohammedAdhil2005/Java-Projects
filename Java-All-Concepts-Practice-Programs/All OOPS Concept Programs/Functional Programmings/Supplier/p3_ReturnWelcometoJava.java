import java.util.function.*;

class  p3_ReturnWelcometoJava
{
	public static void main(String[] args) 
	{
		Supplier<String> s=()->"Welcome to the Java universe";
		System.out.println(s.get());
	}
}
