import java.util.Scanner;
class  num7_palindrome
{
	public static boolean reverse(int n){
		int org=n;
		int rev=0;
		
		while(n!=0){
			int last=n%10;
			rev=rev*10+last;
			n=n/10;
			
		}
		if(org==rev){
			return true;
		}else{
			return false;
		}
	}
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
				System.out.println("Enter a number");
		int n=scan.nextInt();
		boolean res=reverse(n);
		if(res){
		System.out.println("\n yes its palindrome ");
		}
		else{
			System.out.println("\n yes its not palindrome ");
		}
		
		
		}
}
