import java.util.function.*;

class  p7_convertLowercase
{
	public static void main(String[] args) 
	{
		Function<String,String> f=(a)-> a.toLowerCase();
		
		System.out.println("LOWERCASE IS ---> "+f.apply("ADHIL"));
	}
}
