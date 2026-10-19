import java.util.Scanner;
class p15_diamondspacetriangle 
{
	public static void p15(int n){
		int star=1;
		int space =n-1;
		
		for(int i=1;i<=n;i++){
			for(int k=1;k<=space;k++){
				System.out.print(" ");
			}
			
			for(int j=1;j<=star;j++){
				if(i==1||i==n||j==1||j==star){
				System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			
			System.out.println();
			star=star+2;
			space--;
			
		}
		
		star=n*2-3;
		space=1;
		
		for(int i=1;i<=n;i++){
			for(int k=1;k<=space;k++){
				System.out.print(" ");
			}
			
			for(int j=1;j<=star;j++){
			if(i==n-1||j==1||j==star){
				System.out.print("*");
				}
			else{
				System.out.print(" ");
			    }
			}
			
			
			System.out.println();
			star=star-2;
			space++;
			
		}
		
	}
	public static void main(String[] args) 
	{
		
		Scanner scan=new Scanner(System.in);
		System.out.print("\n Enter the how many rows of rev star triangle  ---->   ");
		int num=scan.nextInt();;
		System.out.println();
		p15(num);
	}
}
