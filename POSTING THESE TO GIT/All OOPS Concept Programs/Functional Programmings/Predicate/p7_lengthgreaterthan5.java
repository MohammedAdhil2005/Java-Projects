import java.util.function.*;

class p7_lengthgreaterthan5
{
	public static void main(String[] args) 
	{
		Predicate<String> p=(n)->{
			if(n.length()>5){
				System.out.println("YEPPPPP !!!!");
				return true;
			}
			else{
				System.out.println("NOPEEEEE !!!!");
				return false;
			}
		};
		
		System.out.println("OUTPUT IS ---> "+p.test("Adhilll"));
	}
}
