import java.util.function.*;

class  p10_PrintMultipilicationTable
{
	public static void main(String[] args) 
	{
		Consumer<Integer> c=(a)->{
			for(int i=1;i<=a;i++){
				System.out.println(i+" X "+i+" = "+i*i);
			}
		};
		
		c.accept(10);
		
	}
}
