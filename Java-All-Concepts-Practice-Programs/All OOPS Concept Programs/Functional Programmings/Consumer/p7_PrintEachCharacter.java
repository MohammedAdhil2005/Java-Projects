import java.util.function.*;

class  p7_PrintEachCharacter
{
	public static void main(String[] args) 
	{
		Consumer<String> c=(a)->{
		for(int i=0;i<a.length();i++){
		char ch=a.charAt(i);
		System.out.println(i+1 +". "+ch);
		}
		};
		
		c.accept("Adhil");
	}
}
