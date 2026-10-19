class p4_fibonacci 
{
	public static void fibo(int n){
		int a=0;
        int b=1;
		
		while(a<n){
			System.out.print(a+" ");
			int c=a+b;
			a=b;
			b=c;
		}  
	}
	
	public static void main(String[] args) 
	{
		int n=5;
		fibo(n);
	}
}
