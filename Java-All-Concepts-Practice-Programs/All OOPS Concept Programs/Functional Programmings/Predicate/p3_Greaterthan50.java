import java.util.function.*;

class p3_Greaterthan50
{
	public static void main(String[] args) 
	{
		Predicate<Integer> p=(n)->{
			if(n>50){
				System.out.println("YEPP GREATER !!!!");
				return true;
			}
			else{
				System.out.println("ITS NOT GREAT !!!!");
				return false;
			}
		};
		
		System.out.println("OUTPUT IS ---> "+p.test(51));
	}
}
