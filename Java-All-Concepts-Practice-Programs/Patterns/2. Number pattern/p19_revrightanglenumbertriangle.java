import java.util.Scanner;
class p19_revrightanglenumbertriangle 
{
	public static void p19(int n){
		int num=5;
		
		for(int i=1;i<=n;i++){
			for(int j=1;j<=num;j++){
				System.out.print(j);
			}
			
			System.out.println();
			num--;
		}
	}
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("\n Enter the how many rows of rev right angle number triangle  ---->   ");
		int num=scan.nextInt();;
		System.out.println();
		p19(num);
	}
}
