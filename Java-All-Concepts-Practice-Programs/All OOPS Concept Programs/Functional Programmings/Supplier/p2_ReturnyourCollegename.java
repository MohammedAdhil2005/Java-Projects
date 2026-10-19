import java.util.function.*;

class  p2_ReturnyourCollegename
{
	public static void main(String[] args) 
	{
		Supplier<String> s=()->"College name is --> NGM";
		System.out.println(s.get());
	}
}
