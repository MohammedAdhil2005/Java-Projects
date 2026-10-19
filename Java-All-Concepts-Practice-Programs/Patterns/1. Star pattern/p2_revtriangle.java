import java.util.Scanner;
class p2_revtriangle 
{
    public static void p2(int n){
		int star=n*2-1;
		int space=0;
		
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
		System.out.print("\n Enter the how many rows of rev star triangle  ---->   ");
		int num=scan.nextInt();;
		System.out.println();
		p2(num);
	}
}
