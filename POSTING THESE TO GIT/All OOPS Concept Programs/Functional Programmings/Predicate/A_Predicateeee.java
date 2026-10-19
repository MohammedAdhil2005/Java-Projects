import java.util.function.*;

class  A_Predicateeee
{
	public static void main(String[] args) 
	{
		Predicate<Integer> p=(n)->n%2==0;
		boolean res=p.test(10);
		
		if(res){
			System.out.println("Evennnn");
		}
		else{
			System.out.println("Oddddd");
		}
		
	}
}
