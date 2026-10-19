import java.util.Scanner;
class p9_diamondtriangle 
{
	public static void p9(int n){
		int star=1;
		int space=n-1;
		
		for(int i=1;i<=n;i++){
			for(int k=1;k<=space;k++){
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++){
				System.out.print("*");
			}
			System.out.println();
			space--;
			star=star+2;
		}
		
		space=1;
		star=2*n-3;
		for(int i=1;i<=n;i++){
			for(int k=1;k<=space;k++){
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++){
				System.out.print("*");
			}
			System.out.println();
			space++;
			star=star-2;
		}
	}
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("\n Enter the number for diamond star triangle  ---->   ");
		int num=scan.nextInt();;
		System.out.println();
		p9(num);
	}
}
