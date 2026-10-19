import java.util.Scanner;
class p10_spacetriangle 
{
	public static void p10(int n){
		int star=1;
		int space=n-1;
		
		for(int i=1;i<=n;i++){
			for(int k=1;k<=space;k++){
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++){
				if(i==1||i==n||j==1||j==star){
				System.out.print("*");}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
			space--;
			star=star+2;
		}
	}
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("\n Enter the number for space triangle  ---->   ");
		int num=scan.nextInt();;
		System.out.println();
		p10(num);
	}
}
