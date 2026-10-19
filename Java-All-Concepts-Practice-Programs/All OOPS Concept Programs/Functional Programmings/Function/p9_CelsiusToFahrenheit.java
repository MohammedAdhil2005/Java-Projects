import java.util.function.*;

class  p9_CelsiusToFahrenheit
{
	public static void main(String[] args) 
	{
		Function<Double, Double> f = (a) -> a*9/2+32;
		
		System.out.println("FARENHEAT IS ---> "+f.apply(25.0));
	}
}
