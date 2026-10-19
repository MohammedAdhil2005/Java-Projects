import java.util.function.*;

class  p5_PrintStringinUppercase
{
	public static void main(String[] args) 
	{
		Consumer<String> c=(a)->System.out.println(a.toUpperCase());
		
		c.accept("adhil");
	}
}
