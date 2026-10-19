class num8_countdigits
{
	public static int count(int n){
		int c=0;
		
		while(n!=0){
			n=n/10;
			c++;
		}
		return c;
	}
	public static void main(String[] args) 
	{
		int num=189;
		int res=count(num);
		System.out.println(num+" this number having "+res+" three digitss!");
	}
}
