import java.util.function.*;

class  p4_Add10
{
	public static void main(String[] args) 
	{
		Function<Integer,Integer> f=(a)-> a+10;
		
		System.out.println("10 ADDED IS ---> "+f.apply(5));
	}
}
