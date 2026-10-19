import java.util.Scanner;
class p7_boxtriangle 
{
	public static void p7(int n){
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("\n Enter the how many rows&columns of box star triangle  ---->   ");
		int num=scan.nextInt();;
		System.out.println();
		p7(num);
	}
}
