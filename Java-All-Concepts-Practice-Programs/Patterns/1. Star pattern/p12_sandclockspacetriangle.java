import java.util.Scanner;
class p12_sandclockspacetriangle 
{
	public static void p12(int n){
		int star=n*2-1;
		int space=0;
		
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
			space++;
			star=star-2;
		}
		
		star=3;
		space=n-2;
		
		for(int i=1;i<n;i++){
			
			for(int k=1;k<=space;k++){
				System.out.print(" ");
			}
			
			for(int j=1;j<=star;j++){
				if(i==n-1||i==n||j==1||j==star){
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
		System.out.print("\n Enter the how many rows of left angle star triangle  ---->   ");
		int num=scan.nextInt();;
		System.out.println();
		p12(num);
	}
}
