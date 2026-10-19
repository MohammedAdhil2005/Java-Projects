class num10_productofdigits 
{
	public static int productofdigits(int n){
		int pro=1;
		while(n!=0){
			int last=n%10;
			pro=pro*last;
			n=n/10;
		}
		return pro;
	}
	public static void main(String[] args) 
	{
		int num=25;
		int res=productofdigits(num);
		System.out.print(res);
		
	}
}
