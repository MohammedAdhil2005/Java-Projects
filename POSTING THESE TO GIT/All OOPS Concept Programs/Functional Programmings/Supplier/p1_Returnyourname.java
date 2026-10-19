import java.util.function.*;

class  p1_Returnyourname
{
	public static void main(String[] args) 
	{
		Supplier<String> s=()->"Adhil";
		System.out.println(s.get());
	}
}
