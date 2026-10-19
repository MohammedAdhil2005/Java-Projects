import java.util.function.*;

class p2_PositiveandNegative
{
	public static void main(String[] args) 
	{
		Predicate<Integer> p=(n)->{
			if(n>=1){
				System.out.println("Positive !!!!");
				return true;
			}
			else{
				System.out.println("Negativee !!!!");
				return false;
			}
		};
		
		System.out.println("OUTPUT IS ---> "+p.test(10));
		System.out.println("OUTPUT IS ---> "+p.test(-10));
		
	}
}
