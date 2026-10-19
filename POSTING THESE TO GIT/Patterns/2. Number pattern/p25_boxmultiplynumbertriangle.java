import java.util.Scanner;
class p25_boxmultiplynumbertriangle 
{
	public static void p25(int n){
		
		for(int i=1;i<=n;i++){
			
			for(int j=1;j<=n;j++){
				
				if(i*j<=9)
				{
				    System.out.print("0"+i*j+" ");
				}
				else{
					System.out.print(i*j+" ");
				}
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
		p25(num);
		
	}
}
