import java.util.function.*;

class p8_VoteEligible
{
	public static void main(String[] args) 
	{
		Predicate<Integer> p=(n)->{
			if(n>=18){
				System.out.println("YEPPPPP VOTE!!!!");
				return true;
			}
			else{
				System.out.println("NOPEEEEE NOT ELIGIBLE!!!!");
				return false;
			}
		};
		
		System.out.println("OUTPUT IS ---> "+p.test(20));
	}
}
