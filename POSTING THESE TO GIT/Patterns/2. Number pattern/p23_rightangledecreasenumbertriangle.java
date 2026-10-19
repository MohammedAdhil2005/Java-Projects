import java.util.Scanner;
class  p23_rightangledecreasenumbertriangle
{
	public static void p23(int n){
		int num=1;
		
		for(int i=1; i<=n; i++){
			for(int j=1; j<=num; j++){
				System.out.print( i-j+1 +" ");
			}
			System.out.println();
			num++;
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("\n Enter the how many rows of right angle decrease triangle  ---->   ");
		int num=scan.nextInt();;
		System.out.println();
		p23(num);
	}
}
