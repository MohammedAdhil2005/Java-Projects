import java.util.function.*;

class  p9_PrintLengthofaString
{
	public static void main(String[] args) 
	{
		Consumer<String> c=(a)->
		System.out.println("LENGTH OF A STRING IS ---> "+a.length());
		
		c.accept("Mohammed");
	}
}
