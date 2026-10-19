import java.util.function.*;

class A_Functionnn 
{
	public static void main(String[] args) 
	{
		Function<Integer,Double> f=(a)-> a*2.0;
		
		System.out.println("SQUARE VALUE IS ---> "+f.apply(2));
	}
}
