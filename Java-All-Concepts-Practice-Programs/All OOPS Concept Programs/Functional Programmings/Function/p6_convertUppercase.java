import java.util.function.*;

class  p6_convertUppercase
{
	public static void main(String[] args) 
	{
		Function<String,String> f=(a)-> a.toUpperCase();
		
		System.out.println("UPPERCASE IS ---> "+f.apply("adhil"));
	}
}
