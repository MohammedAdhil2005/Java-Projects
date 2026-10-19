import java.util.function.*;

class p5_startwithA
{
	public static void main(String[] args) 
	{
		Predicate<String> p=(n)->{
			if(n.startsWith("A")){
				System.out.println("YEPPPPP !!!!");
				return true;
			}
			else{
				System.out.println("NOPEEEEE !!!!");
				return false;
			}
		};
		
		System.out.println("OUTPUT IS ---> "+p.test("Adhil"));
	}
}
