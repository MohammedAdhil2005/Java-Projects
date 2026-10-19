import java.util.Scanner;
class  p3_righttriangle
{
	public static void p3(int n){
		int star=1;
		
		for(int i=1;i<=n;i++){
			for(int j=1;j<=star;j++){
				System.out.print("*");
			}
			System.out.println();
			star++;
		}
	}
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("\n Enter the how many rows of right angle star triangle  ---->   ");
		int num=scan.nextInt();;
		System.out.println();
		p3(num);
	}
}
