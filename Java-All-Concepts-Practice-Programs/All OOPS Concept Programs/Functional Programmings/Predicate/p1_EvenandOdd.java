import java.util.function.*;

class p1_EvenandOdd
{
	public static void main(String[] args) 
	{
		Predicate<Integer> p=(n) ->{
			if(n%2==0){
				System.out.println("Its Even!!!");
				return true;
			}
			else{
				System.out.println("Its Odd!!!");
				return false;
			}
		};
		
		System.out.println("OUTPUT IS ---> "+p.test(10));
		System.out.println("OUTPUT IS ---> "+p.test(11));
	}
}
