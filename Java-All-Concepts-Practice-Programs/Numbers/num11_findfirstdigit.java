class num11_findfirstdigit
{
	public static int findfirstdigit(int n){
		
		while(n>=10){
			n=n/10;
		}
		return n;
	}
	public static void main(String[] args) 
	{
		int num=153;
		int res=findfirstdigit(num);
		System.out.println(num+" First digit of this number is "+res);
	}
}
