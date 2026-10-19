import java.util.Scanner;
class  p17_boxnumbertriangle
{
	public static void p17(int n){
		
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("\n Enter the how many rows of box triangle  ---->   ");
		int num=scan.nextInt();;
		System.out.println();
		p17(num);
	}
}
