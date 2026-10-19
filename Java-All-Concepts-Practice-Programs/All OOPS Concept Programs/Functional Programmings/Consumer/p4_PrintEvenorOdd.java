import java.util.function.*;

class  p4_PrintEvenorOdd
{
	public static void main(String[] args) 
	{
		Consumer<Integer> c=(a)->{
		
		if(a%2==0){
			System.out.println("Its Evennnn");
		}
		else{
			System.out.println("Its oddd");
		}};
		
		c.accept(10);
	}
}
