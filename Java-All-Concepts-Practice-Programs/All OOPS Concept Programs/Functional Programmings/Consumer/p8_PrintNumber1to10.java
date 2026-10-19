import java.util.function.*;

class  p8_PrintNumber1to10
{
	public static void main(String[] args) 
	{
		Consumer<Integer> c=(a)->{
			for(int i=1;i<=a;i++){
				System.out.println(i);
			}
		};
		
		c.accept(10);
	}
}
