import java.util.Scanner;
class num1_oddoreven 
{
	public static boolean oddoreven(int n){
		if(n%2==0){
			return true;//System.out.print("even");
		}
		else{
			return false;//System.out.print("odd");
		}
	}
	public static void main(String[] args) 
	{
		Scanner scan =new Scanner(System.in);
		int num=scan.nextInt();
        boolean res=oddoreven(num);
		if (res)
		{
			System.out.print("even");
		}
		else{
			System.out.print("odd");
		}
	}
}
