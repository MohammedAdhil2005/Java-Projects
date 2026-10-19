import java.util.Scanner;
class  p13_rightwardspacetriangle
{
	public static void p13(int n){
		int star=1;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=star;j++){
				if(i==1 || j==1 || j==star){
				System.out.print("*");}
				else{
				System.out.print(" ");
				}
			}
			System.out.println();
			star++;
		}
		
		star=n-1;
		int space=1;
		
		for(int i=1;i<=n;i++){
			for(int j=1;j<=star;j++){
				if(i==n || j==1 || j==star){
				System.out.print("*");}
				else{
				System.out.print(" ");
				}
			}
			System.out.println();
			star--;
			space++;
		}
		
	}
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("\n Enter the how many rows of left angle star triangle  ---->   ");
		int num=scan.nextInt();;
		System.out.println();
		p13(num);
	}
}
