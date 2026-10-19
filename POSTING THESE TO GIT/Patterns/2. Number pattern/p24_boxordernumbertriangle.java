import java.util.Scanner;
class p24_boxordernumbertriangle 
{
	public static void p24(int n){
		int num=1;
		
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(num<=9){
				System.out.print("0"+num++ +" ");
				}
				else{
				System.out.print(num++ +" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("\n Enter the how many rows of box ordered number triangle  ---->   ");
		int num=scan.nextInt();;
		System.out.println();
		p24(num);
	}
}
