import java.util.Scanner;
class  p26_boxonebyonenumbertriangle
{
	public static void p26(int n){
		
		for(int i=1;i<=n;i++){
			
			for(int j=1;j<=n;j++){
				
					System.out.print(i+j-1+" ");
			}
			
			System.out.println();
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("\n Enter the how many rows of box multiply number triangle  ---->   ");
		int num=scan.nextInt();;
		System.out.println();
		p26(num);
	}
}
