import java.util.Scanner;
class  num39_happynumber
{
	public static int happynumber(int n){
		int sum=0;
		
		while(n!=0 || sum>9){
			if(n==0){
				n=sum;
				sum=0;
			}
				int last=n%10;
				sum=sum+last*last;
				n=n/10;
		}
		
		if(sum==1){
			return 1;
		}
		else{
			return 0;
		}
	}
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();  
		int res=happynumber(num);
		
		if(res==1){
		System.out.println("happyyyy!");}
		else{
		System.out.println("not happyyyy!");
		}
	}
}
