import java.util.function.*;

class  p1_Squareofanumber
{
	public static void main(String[] args) 
	{
		Function<Integer,Integer> f=(a)-> a*a;
		
		System.out.println("SQUARE VALUE IS ---> "+f.apply(2));
		
	}
}
