import java.util.Scanner;
class p27_number1triangle 
{
	public static void p27(int n){
		int star=1;
		int space=n-1;
		
		for(int i=1;i<=n;i++){
			for(int k=1;k<=space;k++){
				System.out.print("  ");
			}
			
			int count=1;
			
			for(int j=1;j<=star;j++){
				if(j<i){
					System.out.print(count++ + " ");
				}
				else{
					System.out.print(count-- + " " );
				}
			}
			
			System.out.println();
			star+=2;
			space--;
			
			
			
		}
		
	}
	
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("\n Enter the how many rows of number triangle  ---->   ");
		int num=5;;
		System.out.println();
		p27(num);
	}
}
