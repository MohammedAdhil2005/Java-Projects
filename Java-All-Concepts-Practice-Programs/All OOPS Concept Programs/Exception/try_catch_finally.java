import java.util.Scanner;

class try_catch_finally 
{
	public static void main(String[] args) 
	{
		Scanner scan =new Scanner(System.in);
		try{
			int a=10/scan.nextInt();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		finally{
			scan.close();
			System.out.println("Resource closed!!!");
		}
		
	}
}
