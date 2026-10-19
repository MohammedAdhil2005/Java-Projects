class p2_palindrome
{
	public static void main(String[] args) 
	{
		int n=121;
		int org=n;
		int rev=0;
		
		while(n!=0){
			int last=n%10;
			rev=rev*10+last;
			n=n/10;
		}
		
		if(org==rev){
			System.out.println("Palindrome!!!");
		}
		else{
			System.out.println("Not palindrome!!!");
		}
		
	}
}
