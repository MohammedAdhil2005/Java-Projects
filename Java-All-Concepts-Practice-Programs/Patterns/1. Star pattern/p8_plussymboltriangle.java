import java.util.Scanner;
class p8_plussymboltriangle 
{
	public static void p8(int n){
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				
				if(i==n/2+1 || j==n/2+1) {
					if(i==j){
						System.out.print("@ "); 
					}
					else{
						System.out.print("* ");
					}
				}
				
				else{
					System.out.print("  ");
				}
		}
		System.out.println();
	}}
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("\n Enter the number  ---->   ");
		int num=5;
		System.out.println();
		p8(num);
	}
}
