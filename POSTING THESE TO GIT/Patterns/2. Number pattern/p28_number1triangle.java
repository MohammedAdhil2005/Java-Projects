import java.util.Scanner;
class  p28_number1triangle
{
	public static void p28(int n){
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(i==j){
				System.out.print(j+" ");
				}
				else{
				System.out.print("1"+" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("\n Enter the how many rows number triangle  ---->   ");
		int num=scan.nextInt();;
		System.out.println();
		p28(num);
	}
}
