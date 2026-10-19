import java.util.function.*;

class p6_endwithg
{
	public static void main(String[] args) 
	{
		Predicate<String> p=(n)->{
			if(n.endsWith("g")){
				System.out.println("YEPPPPP !!!!");
				return true;
			}
			else{
				System.out.println("NOPEEEEE !!!!");
				return false;
			}
		};
		
		System.out.println("OUTPUT IS ---> "+p.test("Adhiling"));
	}
}
