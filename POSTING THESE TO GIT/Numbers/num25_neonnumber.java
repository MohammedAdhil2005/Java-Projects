class num25_neonnumber 
{
	public static boolean neon(int n){
		int sq=n*n;int sum=0;
		while(sq!=0){
			int last=sq%10;
			sum=sum+last;
			sq=sq/10;
		}
		return sum==n;
	}
	public static void main(String[] args) 
	{
		int num=8;
		boolean res=neon(num);
		if(res){
		System.out.println("yes same");}else{System.out.println("not same");}
	}
}
