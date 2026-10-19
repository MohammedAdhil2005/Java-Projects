class  num12_findlastdigit
{
	public static int findlastdigit(int n){
		while(n>=10){
			n=n%10;
		}
		return n;
	}
	public static void main(String[] args) 
	{
		int num=153;
		int res=findlastdigit(num);
		System.out.println(num+" last digit of this number is "+res);
	
	}
}
